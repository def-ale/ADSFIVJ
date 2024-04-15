<?php

    class Database{

        static $db;
    
        public function __construct(){

            if(self::$db == null){
                self::$db = new mysqli('mariadb','root','secret','recados');
            
                if(self::$db->connect_errno > 0){
                    die("Ocorreu um erro { self::$db->connect_error}");
                }
            }
        }
        function getConnection(){
            return self::$db;
        }

        function closeConnection(){
            self::$db->close();
        }
    }
?>