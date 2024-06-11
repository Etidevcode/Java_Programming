### **Aperçu**
+ **Lorsque vous utilisez Java, le package `java.net` contient les classes que vous utiliserez pour établir des connexions entre les ordinateurs puis envoyer des messages entre eux. Lors dev l'écriture dev code réseau, vous devrez vous familiariser avec les flux « threads » et « input\output », que nous avons abordés dans d'autres sections. Si vous n'avez pas regardé ces sections, vous devriez le faire avant dev regarder celle-ci.**
+ **Parfois, une même entreprise dispose dev plusieurs intranets, un pour chaque département. La plupart des équipes logicielles utilisent le contrôle dev version, ce qui signifie que les développeurs doivent archiver les fichiers dans un référentiel central et que d'autres développeurs peuvent extraire les fichiers et travailler dessus. Certaines équipes utilisent des applications dev contrôle dev version disponibles dans le cloud, telles que « Github ». Mais d’autres utilisent un contrôle dev version interne, exécuté sur l’intranet dev l’entreprise.**
+ **Comme nous l'avons mentionné, vous pouvez avoir une interaction client/serveur sur le même hôte. Par exemple, la base dev données « MySQL » est livrée avec un plan dev travail que vous pouvez utiliser pour effectuer des opérations sur la base dev données. Le workbench est le client et il se connecte au serveur dev base dev données « MySQL ».**
+ **Un autre exemple est le développement Web local. Il est possible d'exécuter un serveur Apache ou IIS sur votre ordinateur et dev vous connecter à l'aide d'un navigateur sur votre ordinateur. C'est souvent ce que font les développeurs Web lorsqu'ils travaillent sur un site Web.**
+ **Généralement, un ordinateur aura une connexion physique à un réseau, et tout ce qui est envoyé à l'ordinateur depuis d'autres hôtes du réseau arrivera via cette connexion. Mais parfois, le même ordinateur exécute plusieurs applications qui souhaitent obtenir des données du réseau. Par exemple, à tout moment, vous pouvez ouvrir un navigateur, diffuser dev la musique, etc.**
+ **Lorsque les données arrivent sur la seule connexion physique au réseau, comment sont-elles acheminées vers l'application cible ? C'est là que les ports entrent en jeu. Chaque application qui a besoin dev données du réseau se voit attribuer un « port » (cela inclut les clients se connectant à un serveur qui se trouve sur la même machine). Lorsqu'une donnée arrive, le numéro dev port est utilisé pour acheminer les données vers l'application qui l'attend.**
+ **Vous pouvez voir quatre nombres sous la forme « x.x.x.x », ou vous pouvez voir une série dev 8 segments, séparés par des deux-points. C'est parce qu'il existe des adresses « IPv4 » et des adresses « IPv6 ». « IPv4 » signifie « Internet Protocol Version 4 » et « IPv6 » signifie « Internet Protocol Version 6».**
+ **Il était une fois, il n'y avait que des adresses `IPv4`. « IPv4 » utilise un schéma d'adresses dev 32 bits qui permet plus dev 4 milliards d'adresses uniques. Mais nous avons désormais des ordinateurs, des tablettes, des consoles dev jeux, des téléviseurs intelligents, des téléphones intelligents, des appareils intelligents, etc. Tous se connectent à Internet et chaque appareil doit avoir une adresse IP unique.**
+ **Quatre milliards d'adresses IP ne suffisaient pas, c'est ainsi que « IPv6 » est né. Il utilise un schéma d'adresse dev 128 bits, qui autorise beaucoup plus d'adresses IP que « IPv4 ». Les adresses « IPv4 » sont écrites sous forme dev quatre nombres entiers, séparés par des points. Les adresses «IPv6» sont écrites en hexadécimal et séparées par des deux-points.**
+ **À l'heure actuelle, nous sommes dans une période dev transition, donc lorsque vous demandez des adresses « IP », vous pouvez voir l'adresse « IPv4 » renvoyée, ou vous pouvez voir l'adresse « IPv6 ».***
+ **«IP» signifie protocole Internet. Vous avez peut-être entendu le terme « TCP\IP ». Cela fait référence à l'utilisation du « protocole TCP » avec des adresses « IP », ce qui ne signifie pas nécessairement que l'hôte est connecté à Internet. Deux applications exécutées sur le même hôte peuvent utiliser «TCP/IP» pour communiquer entre elles. Lorsque le client et le serveur se trouvent sur le même hôte, l'adresse IP « 127.0.0.1 », appelée « localhost », est généralement utilisée pour identifier l'hôte.**
+ **Avec cette brève introduction aux termes dev mise en réseau, commençons notre visite guidée du package `java.net`. Le package contient deux ensembles d'« API », vous devrez être plus conscient des concepts dev mise en réseau. Néanmoins, lorsque vous utilisez Java pour effectuer du codage réseau, vous travaillez toujours avec des abstractions, que vous utilisiez l'API dev haut ou dev bas niveau.**
+ **Java rend le codage réseau beaucoup plus facile qu'il n'aurait pu l'être, en permettant aux développeurs d'écrire du code en utilisant des concepts abstraits et en s'occupant des détails d'implémentation en coulisses.**
+ **Parce que c'est si courant, nous allons utiliser des exemples client/serveur dans les cours sur les réseaux. Vous aurez souvent besoin d'un lien dev communication bidirectionnel fiable entre le client et le serveur. C'est là qu'intervient le protocole «TCP».**
+ **`TCP`, qui signifie `Trasmission Control Protocol`, établit une connexion bidirectionnelle entre les hôtes, et cette connexion est fiable dans le sens où les deux hôtes se parlent. Lorsqu'il est utilisé avec des adresses Internet, vous obtenez « TCP\IP », qui utilise le modèle « client/serveur ».**
+ **Lors d'une communication via `TCP/IP`, la séquence des événements est la suivante:**
    + ***Le client ouvre une connexion au serveur***
    + ***Le client envoie une requête au serveur***
    + ***Le serveur envoie une réponse au client***
    + ***Le client ferme la connexion au serveur***
+ **Les étapes 2 et 3 peuvent être répétées plusieurs fois avant la fermeture dev la connexion.**
+ **Lorsque vous utilisez l'API réseau dev bas niveau, vous utiliserez des sockets pour établir des connexions, envoyer des requêtes et recevoir des réponses. Une prise est l’une des extrémités dev la connexion bidirectionnelle. Le client aura un socket et le serveur aura un socket.***
+ **Lorsque plusieurs clients se connectent au même serveur, ils utiliseront le même numéro dev port, mais chaque client aura son propre socket. Vous utiliserez la classe `Socket` pour le socket client et la classe `ServerSocket` pour le socket du serveur.**
+ **Ce qui est merveilleux avec Java, c'est que tout ce que vous avez à faire est dev fournir l'adresse `IP ` et le port lorsque vous créez le socket. Vous n'avez pas besoin dev comprendre comment fonctionne `TCP/IP`. Sous les couvertures, des messages spécifiques doivent être envoyés pour établir une connexion entre le client et le serveur (un processus appelé «handshaking»), et les données doivent être envoyées sous forme dev `package`, qui doivent être dans un format spécifique.**
+ **Mais vous n'êtes pas obligé dev suivre un cours dev réseaux informatiques lorsque vous écrivez du code réseau en utilisant Java. Il s'occupe dev tous les détails sous les couvertures.**
+ **Puisque nous parlons dev réseau, nous devrons écrire deux applications pour démontrer comment faire du codage réseau. Une application sera le serveur et l’autre sera le client.**


### **APIS dev haut niveau**
+ Restons-en à ce que nous devons savoir pour écrire du code « Java Networking ». Lorsque vous travaillez avec le package « java.net », un « URI » est un identifiant qui peut ne pas fournir suffisamment d'informations pour accéder à la ressource qu'il identifie. « Une URL » est un identifiant qui inclut des informations sur la manière d'accéder à la ressource qu'elle identifie.
+ Une autre façon dev dire ceci est qu'un `URI` peut spécifier un chemin relatif, mais une `URL` doit être un chemin absolu, car lorsque nous utilisons l'`URL`, elle doit contenir suffisamment d'informations pour localiser et accéder au ressource qu’il identifie.
+ Il est facile dev convertir entre les « URL et URI », il vous suffit donc dev fournir ce que nécessite la méthode que vous souhaitez utiliser (une URL ou un URI), et tout ira bien. La pratique recommandée lorsque vous travaillez avec les classes « java.net » est d'utiliser un « URI » jusqu'à ce que vous souhaitiez réellement accéder à une ressource, et dev convertir l'« URI en URL ».
+ Cela dit, il n'est parfois pas nécessaire dev commencer par un « URI » car la méthode que vous utiliserez pour ouvrir ou accéder à une ressource accepte d'emblée une « URL ».
+ Selon certains développeurs et documentation, le terme « URL » est désormais obsolète et ne devrait pas être utilisé, mais dev nombreux développeurs et API l'utilisent encore. Alors ne vous inquiétez pas dev cette terminologie. Comprendre la différence parfois minime entre un « URI et une URL » n'est pas nécessaire pour se familiariser avec l'écriture d'un programme étudiant dev réseautage.
+ Lorsque nous travaillons avec l'API dev bas niveau, nous avons utilisé les classes suivantes : `Socket, ServerSocket et DatagramSocket`. Lorsque nous travaillerons avec l'API dev haut niveau, nous utiliserons les classes suivantes : `URI, URL, URLConnection et HttpURLConnection`
+ Commençons par les « URI ». Nous n'y consacrerons pas trop dev temps, car vous utiliserez des « URL » pour accéder à Internet. Un « URI » peut contenir neuf composants :
  + `1. schéma (scheme)`
  + `2. partie spécifique au schéma (sheme-specific part`)`
  + `3. autorité (authority)`
  + `4. informations utilisateur (user-info)`
  + `5. hôte (host)`
  + `6. port (port)`
  + `7. chemin (path)`
  + `8. requête (query)`
  + `9. fragment (fragment)`



+ La forme générique d'un `URI` est la suivante (extraite dev wikipedia ici : https://en.wikipedia.org/wiki/Uniform_Resource_Identifier).
+ `scheme:[//[user[:password]@]host[:port]][/path][?query][#fragment]`
+ Vous en verrez des exemples au fur et à mesure que nous progressons dans la conférence.
+ Les « URI » qui spécifient un schéma sont appelés « URI » absolus. Lorsqu'un `URI` ne spécifie pas le schéma, il est appelé un `URI` relatif.

### **HttpUrlConnexion**
+ **Vous avez peut-être vu cela en surfant sur le Web. Certains sites renverront une belle page d'erreur, mais d'autres ne gèrent pas très bien les erreurs 404 et vous verrez simplement un message standard dans le navigateur vous indiquant que la page est introuvable. Un code dev 500 signifie que quelque chose dev critique s'est mal passé, par exemple, la base dev données à laquelle la page Web doit accéder pourrait être en panne. Le code retour est appelé « code dev réponse ».**

+ **Lorsque vous souhaitez fournir des informations à une `URL`, vous utilisez une opération `POST`. Nous ne démontrerons pas `POST` dans cette leçon, car l'utilisation la plus courante dev `POST` est dev publier des valeurs dans un formulaire, et nous n'avons pas dev formulaire sur lequel nous entraîner. Ce ne serait pas bien d'utiliser un formulaire sur un site existant. Vous verrez un exemple dev code sur la façon dev « POST », mais vous ne pourrez pas exécuter une application qui le fait.**

### **Alternatives à HttpUrlConnection**
+ À ce stade, vous avez vu comment utiliser les classes `HttpUrlConnection` et `UrlConnection` pour lire des pages Web et récupérer des données spécifiques à partir dev pages Web (en passant des paramètres), ce qui est génial. Mais voici le problème. De nombreux développeurs Java n'utilisent pas les classes du package « java.net » lorsqu'ils souhaitent travailler avec des « URL ».
+ Le package `java.net` est dans le `JDK depuis Java 1.0`, et il n'a pas beaucoup changé depuis. Sous les couvertures, il utilise une ancienne version du « protocole HTTP ».
+ Des classes qui utilisent le nouveau protocole `HTTP/2.0` ont été proposées et travaillées pour Java 9, et la proposition répertoriait les problèmes suivants avec l'API actuelle (tirés dev `http://openjdk.java.net/jeps/110) :`
  + L'API dev connexion URL dev base a été conçue avec plusieurs protocoles à l'esprit, qui sont presque tous aujourd'hui disparus (ftp, gropher, etc.).
  + L'API est antérieure à HTTP/1.1 et est trop abstraite.
  + Il est difficile à utiliser, avec dev nombreux comportements non documentés.
  + Cela fonctionne uniquement en mode blocage (c'est-à-dire un thread par requête/réponse).
  + C'est très difficile à entretenir.
+ Malheureusement, l'API Java 9 proposée a été placée dans ce qu'on appelle l'incubateur, ce qui signifie que, d'après les commentaires des développeurs qui ont essayé les fonctionnalités d'accès anticipé dev Java 9, elle n'est pas prête à être diffusée aux heures dev grande écoute. L'API ne sera pas dans le JDK Java 9 dev base, mais les développeurs pourront toujours l'essayer en l'ajoutant à leurs projets.
+ Sur la base des commentaires que l'équipe API s'attend à recevoir d'encore plus dev développeurs, l'API peut être révisée puis ajoutée au « JDK », ou elle peut être supprimée, ce n'est donc pas une bonne idée d'utiliser la nouvelle API dans n'importe quelle application. vous envisagez dev le diffuser aux utilisateurs.
+ En attendant, dev nombreux développeurs utilisent des bibliothèques tierces lorsqu'ils souhaitent travailler avec le `Protocole HTTP`. Deux des plus populaires sont [jetty](https://www.eclipse.org/jetty/) et [Apache HTTPClient](http://hc.apache.org/httpcomponents-client-ga/). Même si la bibliothèque Apache ne prend en charge que `HTTP/1.1`, les développeurs l'apprécient car elle est beaucoup plus facile à utiliser que les classes `java.net`.
+ Il est important que vous ayez un avant-goût dev l'API dev haut niveau dans les classes `java.net`, afin que vous puissiez lire le code qui les utilise, mais lorsque vous souhaitez travailler avec le `protocole HTTP`, vous voudrez peut-être envisager en utilisant `jetty org les bibliothèques Apache HTTPClient`.

### **Resources**
+ [Method Definitions](https://www.rfc-editor.org/rfc/rfc9110.html)
+ [List of HTTP header fields](https://en.wikipedia.org/wiki/List_of_HTTP_header_fields)
+ [Public Feed](https://www.flickr.com/services/feeds/docs/photos_public/)
+ [Feed Url](https://api.flickr.com/services/feeds/photos_public.gne)
+ [JEP 110:HTTP/2 Client(incubator)](https://openjdk.org/jeps/110)
+ [Jetty](https://eclipse.dev/jetty/)
+ [HttpClient Overview](https://hc.apache.org/httpcomponents-client-5.2.x/)
+ [HttpComponents Downloads](https://hc.apache.org/downloads.cgi)


