<?php

include "index_alku.html";

$palvelin = "localhost";
$username = "trtkp17a3";
$password = "kAWlI9Kw";
$tietokanta = "trtkp17a3";

// luo yhteys
$yhteys = new mysqli($palvelin, $username, $password, $tietokanta);
// tarkista yhteys
if ($yhteys->connect_error) {
    die("Connection failed: " . $yhteys->connect_error);
} 
error_reporting(0); //piilottaa virheet
$sql = "SELECT teksti, paivamaara FROM mikko1521_uutiset LIMIT 5";
$result = $yhteys->query($sql);

if ($result->num_rows > 0) {

    while($row = $result->fetch_assoc()) {
        if("paivamaara"==null){
            echo ""."<br>";
        } else {
            echo $row["paivamaara"]."<br>";
        }
        echo $row["teksti"]."<br>";
        echo "<br>";
    }
} else {
    echo "Tervetuloa kahville!";
}
$yhteys->close();

include "index_loppu.html";

?>