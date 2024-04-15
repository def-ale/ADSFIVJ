<?php

require_once "Database.php";

$db = new Database();

$con = $db->getConnection();

if(isset($_GET["excluir"])):
    $id = $_GET["excluir"];
    $sql = "DELETE FROM recados.pessoa WHERE id=$id;";

    if ($result = $con->query($sql)):
?>
    <p>Registro Excluido!</p>
<?php
    endif;
endif;


require_once "RecadoDAO.php";

$sql = 'SELECT * FROM recados.pessoa;';

if ($result = $con->query($sql)):
    if ($result->num_rows > 0):
?>
    <table border = 1>
        <tr>
            <th>ID</th>
            <th>Nome</th>    
            <th>Email</th>
            <th>Cidade</th>
            <th>Recado</th>
            <th>Excluir</th>
            <th>Alterar</th>
        </tr>
<?php
    while($recado = $result->fetch_object('RecadoDAO')):
        $recado->imprimeLinhaTabela();
        endwhile
    
?>
    </table>

<?php
    else:
?>
    <p>Nenhum registro encontrado!</p>
<?php
    endif;
endif;