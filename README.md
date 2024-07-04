# Proyecto #34 Red Hidráulica

## Autor: Jonathan Alejandro

## Fecha: 4/07/2024

## Descripción: Programa que realiza el control de la Red Hidráulica de una instalación

### Datos

#### Despositos

Se tiene control de la cantidad de depósitos existentes para almacenar el agua.

Los depósitos utilizados son:

> Tanques
> Cisternas

De cada uno de estos se conoce:

> Capacidad
> Estado
> Tipo de abasto de agua.

De los tanques se sabe además de que material es:

> Plástico
> Metal
> Fibrocemento

Las cisternas se clasifican en:

> Simples
> Compuestas

De las simples se conoce la forma que tienen:

> Cúbica
> Cilíndrica

De las compuestas se conoce:

> Cantidad de compartimentos dentro de ella

#### Sistema de Bombeo

Se controlará también la cantidad de bombas de agua y de turbinas de ambas se sabe:

> Estado
> Regimen

Ademas de las bombas de agua se sabe:

> Tiempo de bombeo.

De las turbinas:

> Fuerza

### Funciones

- Mostrar la información de los tanques y cisternas, que se encuentran en mal o regular estado y que el tipo de abasto de agua sea el especificado por el usuario. Esta información debe quedar almacenada en un fichero texto llamado verificar.dat
>
- Mostrar la capacidad de los tanques ordenados por material (1ro los de fibrocemento, 2do los de metal, 3ro los de plástico) y la capacidad de las cisternas ordenadas por su clasificación  (1ro las simples y después las compuestas).
>
- Conocer la cantidad de bombas, turbinas, cisternas y tanques disponibles.
>
- Conocer de las bombas y turbinas la(s) que tiene el mejor régimen de bombeo.
>
- Conocer el tiempo promedio de bombeo de las bombas que están en buen estado.
>
- Estado de la(s) turbina de mayor fuerza.
>
- Determinar la capacidad total de las cisternas, que tengan la cantidad de compartimentos y la forma especificada por el usuario. Esta información debe quedar almacenada en un fichero texto llamado cisternas.dat

### UI

- Elabore una aplicación con interfaz que permita darle solución al problema anterior.
