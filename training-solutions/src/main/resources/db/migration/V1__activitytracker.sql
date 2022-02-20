CREATE TABLE if not exists activities (
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
start_time DATETIME,
activity_desc VARCHAR(100),
activity_type ENUM ('BIKING', 'HIKING', 'RUNNING', 'BASKETBALL') );