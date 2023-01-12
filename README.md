# IntellectDesigArenaApiQuestion

Developed API to send Notification Dispatcher 

I am used Dependency Injection method to inject type of Channel in this Project 

All type of configuration is done in \notificationSender\src\main\resources\configSettings\config.json

In above path we can set Regex and in future we need to add new check or new way to send we can extend it .

API Input :

Url [Post Method] : http://localhost:8080/sendNotification

Input : [Body]  TYPE :Json  Method:POST 
===================SMS===============
{
    "notificationMessage":"Message via SMS",
    "receipients":["9855676626"],
    "typeOfChannel":"Sms"
}

==========Email================
{
    "notificationMessage":"Message via Email",
    "receipients":["test@gmail.com"],
    "typeOfChannel":"Email"
}

===============WhatsApp==============
{
    "notificationMessage":"Message to Whatsapp",
    "receipients":["9855676626"],
    "typeOfChannel":"Sms"
}


OUTPUT:

=========SMS================
{
    "recepients": [
        "9855676626"
    ],
    "flag": "Success",
    "message": "Message  is send to all Receipients via SMS"
}

===============MAIL===========
{
    "recepients": [
        "test@gmail.com"
    ],
    "flag": "Success",
    "message": "Message  is send to all Receipients via Mail"
}

