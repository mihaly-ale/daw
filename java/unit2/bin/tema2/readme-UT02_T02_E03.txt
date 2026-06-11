Math.ceil() siempre redondea los números hacia arriba, al entero más cercano.

Math.floor() siempre redondea los números hacia abajo, al entero más cercano.

Math.rint() redondea al entero más cercano (como parece más “intuitivo”), pero en caso de estar justo en la mitad (por ejemplo, 2.5), redondea al entero par más cercano. El resultado es un double.

Math.round() también redondea al entero más cercano, pero en los valores intermedios (.5) redondea hacia arriba si el número es positivo y hacia abajo si es negativo. El resultado es un int (si el argumento es float) o un long (si es double).