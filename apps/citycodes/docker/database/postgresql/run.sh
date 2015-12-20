#!/usr/bin/env bash

#
# VBoxManage modifyvm "default" --natpf1 "wildfly,tcp,,18080,,8080"
#
# Port to use on this mac: 18080
# Docker port as it is exposed by run: 8080
#

docker run -p 5432:5432 --name postgres -e POSTGRES_PASSWORD=jukilo90 -d postgres
