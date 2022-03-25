PRAGMA foreign_keys = ON;

DROP TABLE IF EXISTS alumno;
CREATE TABLE alumno (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre TEXT,
        apellidos TEXT
);

DROP TABLE IF EXISTS modulo;
CREATE TABLE modulo (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre TEXT,
        numeroHoras INTEGER
);

DROP TABLE IF EXISTS curso;
CREATE TABLE curso (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre TEXT,
        aula TEXT
);

DROP TABLE IF EXISTS evaluacion;
CREATE TABLE evaluacion (
        idAlumno INTEGER,
        idModulo INTEGER,
        idCurso INTEGER,
        notas INTEGER,
        PRIMARY KEY(idAlumno,idModulo,idCurso),
        FOREIGN KEY(idAlumno) REFERENCES alumno(id) ON DELETE CASCADE ON UPDATE CASCADE,
        FOREIGN KEY(idModulo) REFERENCES modulo(id) ON DELETE CASCADE ON UPDATE CASCADE,
        FOREIGN KEY(idCurso) REFERENCES curso(id) ON DELETE CASCADE ON UPDATE CASCADE
);
