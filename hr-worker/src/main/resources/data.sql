CREATE TABLE TB_WORKER (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    daily_income DOUBLE
);

INSERT INTO TB_WORKER (name, daily_income) VALUES ('Bob', 200.00);
INSERT INTO TB_WORKER (name, daily_income) VALUES ('Maria', 300.00);
INSERT INTO TB_WORKER (name, daily_income) VALUES ('Alex', 250.00);