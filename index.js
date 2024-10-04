// Importamos express para crear el servidor web
const express = require('express');

// Importamos las rutas de productos
const productRoutes = require('./routes/productRoutes');

// Cargamos las variables de entorno desde el archivo .env
require('dotenv').config();

// Creamos una aplicación de express
const app = express();

// Middleware para permitir que el servidor acepte JSON en las solicitudes
app.use(express.json());

// Usamos las rutas de productos, todas estarán bajo la ruta /api
app.use('/api', productRoutes);

// Definimos el puerto que tomará desde las variables de entorno o, en su defecto, el puerto 3000
const PORT = process.env.PORT || 3000;

// Iniciamos el servidor en el puerto definido
app.listen(PORT, () => {
    // Mensaje en consola indicando que el servidor está funcionando
    console.log(`server is running on port ${PORT}`); 
});
