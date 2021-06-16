update pagos
set valor_pagado = :valorPagado,
    valor_adeudado = :valorAdeudado,
	fecha_pago = :fechaPago
where id_pago = :idPago;

