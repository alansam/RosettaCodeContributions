#!/bin/sh

export COMMONS_CSV="/Users/alansampson/apache/commons/commons-csv/trunk/target/commons-csv-1.0-SNAPSHOT.jar"

export XCP="$COMMONS_CSV:."

java -cp "$XCP" RCsv

