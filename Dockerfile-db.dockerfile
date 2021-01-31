FROM mcr.microsoft.com/mssql/server:2019-GA-ubuntu-16.04

USER root
ENV ACCEPT_EULA="Y"
ENV SA_PASSWORD="User12333!"
COPY bootstrap.sh /tmp/bootstrap.sh
COPY init.sql init.sql

RUN apt-get -y update && apt-get -y install vim
RUN chmod 775 /tmp/bootstrap.sh