CREATE TABLE ponto(
    id bigint(20) NOT NULL AUTO_INCREMENT,
    entrada timestamp NOT NULL,
    saida timestamp,
    saldo_de_horas varchar(100),
    PRIMARY KEY (id)
);