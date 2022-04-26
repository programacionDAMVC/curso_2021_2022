DROP TABLE IF EXISTS usuarios;
CREATE TABLE usuarios (
   id INTEGER PRIMARY KEY AUTOINCREMENT,
   nombre TEXT NOT NULL,
        apellidos TEXT NOT NULL,
	telefono TEXT,
	dni TEXT NOT NULL UNIQUE,
	email TEXT NOT NULL UNIQUE,
	rol INTEGER DEFAULT 0,
	password TEXT NOT NULL
);

DROP TABLE IF EXISTS reservas;
CREATE TABLE reservas (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
	fecha TEXT,
	duracion INTEGER NOT NULL,
	hora_entrada INTEGER CHECK( hora_entrada IN (1, 2, 3, 4, 5, 6, 7) ) NOT NULL,
	tipo_reserva TEXT CHECK( tipo_reserva IN ('GUIADA','NO_GUIADA') ) NOT NULL DEFAULT 'GUIADA',
	id_usuario INTEGER NOT NULL,
	CONSTRAINT unique_fecha_hora UNIQUE (fecha, hora_entrada),
	CONSTRAINT FK_id_usuario FOREIGN KEY (id_usuario) REFERENCES usuarios(id) ON DELETE CASCADE
);

DROP INDEX IF EXISTS index_email;
CREATE INDEX index_email ON usuarios (email);
DROP INDEX IF EXISTS index_telefono;
CREATE INDEX index_telefono ON usuarios (telefono);
DROP INDEX IF EXISTS index_dni;
CREATE INDEX index_dni ON usuarios (dni);

DROP VIEW IF EXISTS informacion_reservas;
CREATE VIEW informacion_reservas AS select nombre, apellidos, fecha, duracion, hora_entrada, tipo_reserva from usuarios, reservas where id_usuario = usuarios.id;

DROP TABLE IF EXISTS actualizaciones;
CREATE TABLE actualizaciones (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    id_reserva INTEGER,
    id_usuario_old INTEGER,
    id_usuario_new INTEGER,
    hora_entrada_old INTEGER,
    hora_entrada_new INTEGER,
    duracion_old INTEGER,
    duracion_new INTEGER,
    tipo_reserva_old TEXT,
    tipo_reserva_new TEXT,
    date_old TEXT,
    date_new TEXT
);
DROP TRIGGER IF EXISTS actualizado;
CREATE TRIGGER actualizado AFTER UPDATE
ON reservas
BEGIN
        INSERT INTO actualizaciones (id_reserva, id_usuario_old, id_usuario_new, hora_entrada_old, hora_entrada_new, duracion_old, duracion_new, tipo_reserva_old, tipo_reserva_new, date_old, date_new) VALUES (old.id, old.id_usuario,new.id_usuario, old.hora_entrada, new.hora_entrada, old.duracion, new.duracion, old.tipo_reserva, new.tipo_reserva,  old.fecha, new.fecha);
END;







