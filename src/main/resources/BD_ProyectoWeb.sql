-- Eliminar la tabla si ya existe
DROP TABLE IF EXISTS BD_proyecto.articulo;

-- Eliminar el usuario si ya existe
DROP USER IF EXISTS 'usuarioproyecto'@'%';

-- Eliminar el esquema si ya existe
DROP SCHEMA IF EXISTS BDproyecto;

CREATE SCHEMA BDproyecto;


CREATE USER 'usuarioproyecto'@'%' IDENTIFIED BY 'claveproyecto.';


GRANT ALL PRIVILEGES ON BDproyecto.* TO 'usuarioproyecto'@'%';
FLUSH PRIVILEGES;


CREATE TABLE BDproyecto.producto (
  id_producto INT NOT NULL AUTO_INCREMENT,
  nombre_comun VARCHAR(100) NOT NULL,
  descripcion VARCHAR(500) NOT NULL,
  precio INT NOT NULL,
  ruta_imagen VARCHAR(1024),
  activo BOOL,
  PRIMARY KEY (id_producto)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


INSERT INTO BDproyecto.producto (id_producto, nombre_comun, descripcion, precio, ruta_imagen, activo) 
VALUES 
('1', 'Color guard Conditioner- Acondicionador protector de color ', 'Recupera las propiedades naturales del cabello, aportándole fuerza y resistencia.
Sella, protege y extiende el color de cabellos tinturados por más tiempo.', 15000, 'https://www.boterobeauty.com/wp-content/uploads/2020/06/2.2-acondicionador-color-guard-768x768-1.png', true),
('2', 'Salon IN Ampollas Hydra SOS', 'Hidrata, nutre y repara el cabello.
Mejora la textura de la fibra capilar, reestructurando y reparando los cabellos severamente
dañados, secos y químicamente tratados.
Forma una película protectora e hidratante que lo protege de las agresiones externas. Incremente
desde su primer uso la fortaleza, elasticidad, suavidad y brillo del cabello.', 10000, 'https://www.boterobeauty.com/wp-content/uploads/2020/06/AMPOLLAS-21-JUN-20.jpg', false),
('3', 'Salon IN Special for men antidandruff shampoo-anti caspa', 'Shampoo especialmente formulado para tratar y combatir la caspa en el hombre. La caspa es
ocasionada por un mal proceso de renovación celular que a su vez es aprovechado por
microorganismos que habitan en nuestro cuero cabelludo y se encargan de descomponer estas
células muertas irritando y provocando constante comezón.', 15000, 'https://www.boterobeauty.com/wp-content/uploads/2020/06/2.-ANTI-DANDRUFF-768x768.png-19JUN20.png', true),
('4', 'inishing PREP Long Lasting Liss Spray 200cm', 'Es un fluido liso instantáneo que facilita el peinado de cabellos ondulados y rebeldes. Con efecto
duradero incluso en días húmedos.', 15000, 'https://www.boterobeauty.com/wp-content/uploads/2020/06/3.tapa-solida-spray-BLANCO.2132-768x768.png-19JUN20.png', true);