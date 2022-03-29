DROP TABLE IF EXISTS historial;
CREATE TABLE historial (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre TEXT,
        apellidos TEXT,
	fecha_baja TEXT
);

DROP TRIGGER IF EXISTS borrado;
CREATE TRIGGER borrado BEFORE DELETE
ON alumno
BEGIN
	INSERT INTO historial (nombre, apellidos, fecha_baja) VALUES (old.nombre, old.apellidos, datetime('now'));
END;

