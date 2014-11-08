<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Horoscopo</title>
    </head>
    <body>
        <h1>¡¡Bienvenido!!</h1>
        <form action="horoscopo" method="post"> 
            <p> Para saber tu horoscopo escribe tu nombre y selecciona un signo</p>
            <p> Escribe tu nombre </p>
            <input type="text" name="nombre"/><br>
            <select name="signo">
                <option>Aries</option>
                <option>Tauro</option>
                <option>Geminis</option>
                <option>Cancer</option>
                 <option>Leo</option>
                <option>Virgo</option>
                <option>Libra</option>
                <option>Escorpio</option>
                <option>Sagitario</option>
                <option>Capricornio</option>
                <option>Piscis</option>
                <option>Acuario</option>
               
            </select>
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
