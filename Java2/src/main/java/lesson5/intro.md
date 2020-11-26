request
GET /hello.htm HTTP/1.1
User-Agent: Mozilla/4.0 (compatible; MSIE5.01; Windows NT)
Host: www.tutorialspoint.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Connection: Keep-Alive

response
<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html lang="en">
<head>
   <title>400 Bad Request</title>
</head>
<body>
   <h1>Bad Request</h1>
   <p>Your browser sent a request that this server could not understand.</p>
   <p>The request line contained invalid characters following the protocol string.</p>
</body>
</html>

Spring

OkHttp

Retrofit

процессор - ядра - кеш
ядро - изолированная система с собственной памятью

Поток(Thread) - интерфейс между кодом и операционной системой
Операционная система (на системном языке) имеет АПИ для доступа 
к ядрам

4 ядра - не означает что можно создать максимум 4 потока
Количество потоков не ограниченно

Ядра могут делиться на логические ядра

-- - ---    while(true)
  - -   --- while(true)

поток(
    while(true) {
        // calc
    }
).запустить()

// code here

synchronized

monitor = mutex (бинарный симафор) пропускает или блочит


-----|1.---------> 2.
----- 3. ------->