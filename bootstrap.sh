/opt/mssql-tools/bin/sqlcmd

# show db
# /opt/mssql-tools/bin/sqlcmd -S sql -U SA -P 'Pass123456!@#' -Q "SELECT name FROM sys.databases"
# /opt/mssql-tools/bin/sqlcmd -S sql -U SA -P 'Pass123456!@#' -Q "SELECT name, state_desc FROM  sys.databases"

# run init sql
# /opt/mssql-tools/bin/sqlcmd -S sql -U SA -P 'User12333!' -i "/init.sql"