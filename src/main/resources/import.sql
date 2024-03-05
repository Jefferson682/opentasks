-- Insert users for tests
insert into tb_user (first_name, last_name, email, department, created, last_update) values ('Jefferson','Nascimento', 'jefferson@dev.com', 1, '2024-03-05T00:00:00.000+00:00', '2024-03-05T00:00:00.000+00:00');
insert into tb_user (first_name, last_name, email, department, created, last_update) values ('David','Silva', 'david@dev.com', 1, '2024-03-05T00:00:00.000+00:00', '2024-03-05T00:00:00.000+00:00');
insert into tb_user (first_name, last_name, email, department, created, last_update) values ('Michael','Tomas', 'michal@dev.com', 2, '2024-03-05T00:00:00.000+00:00', '2024-03-05T00:00:00.000+00:00');
insert into tb_user (first_name, last_name, email, department, created, last_update) values ('Marcos','Vale', 'marcos@dev.com', 1, '2024-03-05T00:00:00.000+00:00', '2024-03-05T00:00:00.000+00:00');
insert into tb_user (first_name, last_name, email, department, created, last_update) values ('John','Barbosa', 'john@dev.com', 1, '2024-03-05T00:00:00.000+00:00', '2024-03-05T00:00:00.000+00:00');
insert into tb_user (first_name, last_name, email, department, created, last_update) values ('Maria','Geri', 'maria@dev.com', 2, '2024-03-05T00:00:00.000+00:00', '2024-03-05T00:00:00.000+00:00');
insert into tb_user (first_name, last_name, email, department, created, last_update) values ('Antonio','Developer', 'antonio@dev.com', 1, '2024-03-05T00:00:00.000+00:00', '2024-03-05T00:00:00.000+00:00');
insert into tb_user (first_name, last_name, email, department, created, last_update) values ('Victor','Silva', 'victor@dev.com', 1, '2024-03-05T00:00:00.000+00:00', '2024-03-05T00:00:00.000+00:00');
insert into tb_user (first_name, last_name, email, department, created, last_update) values ('Sophie','Tom', 'sophie@dev.com', 2, '2024-03-05T00:00:00.000+00:00', '2024-03-05T00:00:00.000+00:00');

-- Insert tasks for test
insert into tb_task (title, description, protocol_number, user_id, status, classification, created, last_update) values ('My first task of the project', 'Here a good description', '20240305.0001', 1, 1, 2, '2024-03-05T00:00:00.000+00:00', '2024-03-05T00:00:00.000+00:00');
insert into tb_task (title, description, protocol_number, user_id, status, classification, created, last_update) values ('My second task of the project', 'Here a good description', '20240305.0002', 1, 2, 1, '2024-03-05T00:00:00.000+00:00', '2024-03-05T00:00:00.000+00:00');
insert into tb_task (title, description, protocol_number, user_id, status, classification, created, last_update) values ('My third task of the project', 'Here a very good description', '20240305.0003', 1, 1, 2, '2024-03-05T00:00:00.000+00:00', '2024-03-05T00:00:00.000+00:00');
