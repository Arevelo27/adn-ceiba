update paciente
set nombres = :nombres,
    apellidos = :apellidos,
    direccion = :direccion,
    telefono = :telefono,
    email = :email
where identificacion = :identificacion