IF NOT EXISTS(SELECT *
              FROM sys.databases
              WHERE name = 'mssql')
    BEGIN
        CREATE DATABASE [mssql]
    END
GO
USE [mssql]
GO

IF NOT EXISTS(SELECT *
              FROM sys.tables
              WHERE name = 'users'
                and type = 'U')
    BEGIN

        CREATE TABLE users
        (
            id   int         NOT NULL,
            name varchar(20) NOT NULL
        )

    END