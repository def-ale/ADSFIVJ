<?php

require_once "Database.php";

$db = new Database();

$con = $db->getConnection();

?>
<?php
    if(isset($_GET["alterar"])){
        $id = $_GET["alterar"];
        require_once "RecadoDAO.php";

        $sql = "SELECT id, nome, email, cidade, texto FROM recados.pessoa WHERE id={$id};";

        if($result = $con->query($sql)){
            if($result->num_rows > 0){
                $recado = $result->fetch_object('RecadoDAO');
                var_dump($recado);
            }
        }    
    }
    
?>
<form action="<?= isset($recado->id)?"?atualiza=$recado->id":""?>" method="post">
    Nome:
    <input type="text" name="nome" id="nome" value="<?= $recado->nome??''?>"><br>
    E-mail:
    <input type="text" name="email" id="email" value="<?= $recado->email??''?>"><br>
    Cidade:
    <input type="text" name="cidade" id="cidade" value="<?= $recado->cidade??''?>"><br>
    Recado:
    <textarea name="recado" id="recado" cols="30" rows="10"><?= $recado->texto??''?></textarea><br>

    <input type="submit" value="<?= isset($recado->id)?"Atualizar":"Cadastrar"?>"name="enviar">

</form>

<?php

    if (isset($_POST["enviar"])):
        $nome = $_POST["nome"];
        $email = $_POST["email"];
        $cidade = $_POST["cidade"];
        $texto = $_POST["recado"];
    

    if ($_POST["enviar"] == "Cadastrar"):
        $sql = "INSERT INTO recados.pessoa (nome, email, cidade, texto) VALUES (?, ?, ?, ?)";

        
    
        elseif ($_POST["enviar"] == "Atualizar"):
            $id = $_GET["atualiza"];
            $sql = "UPDATE recados.pessoa SET nome=?, email=?, cidade=?, texto=? WHERE id=?";

        endif;

        // $con->query($sql); metodo bruto que NAO evita injeçao SQL
        

        // já esse metodo abaixo usa prepared statements que evitam injeção de sql
        if ($stmt = $con->prepare($sql)) {
            if ($_POST["enviar"] == "Cadastrar") {
                $stmt->bind_param("ssss", $nome, $email, $cidade, $texto);
            } elseif ($_POST["enviar"] == "Atualizar") {
                $stmt->bind_param("ssssi", $nome, $email, $cidade, $texto, $id);
            }
            $stmt->execute();
            $stmt->close();
        }

    endif;
?>