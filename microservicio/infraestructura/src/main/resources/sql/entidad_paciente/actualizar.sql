update entidad_paciente set
  valor = :valor,
  fecha_pago = :fechaPago,
  activo = :activo
where id_paciente = :idPaciente
