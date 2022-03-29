DROP VIEW IF EXISTS generica;
CREATE VIEW generica AS SELECT alumno.nombre as 'nombre' ,apellidos, modulo.nombre as 'modulo' , curso.nombre as 'curso', notas FROM alumno , modulo , curso , evaluacion WHERE idAlumno = alumno.id and idModulo = modulo.id AND idCurso = curso.id;
