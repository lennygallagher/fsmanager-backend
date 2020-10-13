create table if not exists airport (
    id varchar(50) not null,
    name varchar(50),
    iata char(3),
    icao char(4),
    version bigint
)