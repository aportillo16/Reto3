RETO 3 BI

DESCRIPCIÓN FUNCIONAL: Utilizar el codigo del RETO 2 para cargar otras activities, para que si el login "local" se completa exitosamente, mostremos una pantalla de bienvenida con los siguientes elementos: un image view, y dos campos para mostrar: nombre de usuario, direccion.

DESCRIPCIÓN TÉCNICA: A nivel técnico, se continuará utilizando: buildFeatures { viewBinding = true }

Las credenciales serán validadas en una clase llamada local_api, en donde se le ha indicado que el usuario y clave serán únicamnete admin, al validar los EditText contengan datos y que sean los indicados en la clase local_api, se hará uso del intent para llamar otra activity y se le pasará como parámetro un token generado en la clase local_api.

El activity de inicio cuenta con la funcionalidad para que al momento de darle al botón Regresar, no regrese al activity de login, sino salga de la aplicación inmediatamente.

LOGIN:

![image](https://github.com/aportillo16/Reto3/assets/166572036/588ab292-826d-4e22-8c01-51a1ac463218)

MENU:

![image](https://github.com/aportillo16/Reto3/assets/166572036/001f389f-19f5-42ed-a916-541fcdaaf35a)
