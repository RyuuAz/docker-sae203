**Noms :** LIZIARD François, GALMANT Maxime, BATILDE Sacha, HANAK Valentin
**Groupe :** C
**Année :** 1ère année
**IUT Le Havre - Cours GIT**

# Compte-rendus des TP de la SAE 2.03

## TP 1 : Travailler sur un répertoire local

###	1. Configuration de git

On utilise la commande `git config --list` pour obtenir la configuration
actuelle.

####	1.1 Identité

Pour modifier respectivement le nom d'utilisateur et le mail, on entre :
`git config --global user.name "François Liziard"` et `git config --global user.email francois.liziard@etu.univ-lehavre.fr`

####	1.2 Éditeur

Pour configurer l'éditeur par défaut : `git config --global core.editor gedit`

####	Exercices
	
On entre à la suite :
-> `git config --global user.name "François Liziard"`
-> `git config --global user.email francois.liziard@etu.univ-lehavre.fr`
-> `git config --global core.editor gedit`

-> `git config --list`
On remarque que les informations ont été mises à jour :

`user.name=François Liziard`
`user.email=francois.liziard@etu.univ-lehavre.fr`
`core.editor=gedit`

-> `git config user.name`
Retourne : _François Liziard_

-> `git config user.email`
Retourne : _francois.liziard@etu.univ-lehavre.fr_


###	2. Création d'un dépôt git sur une machine locale

On crée, tout d'abord un répertoire courseGIT avec la commande : `mkdir courseGIT`.
Puis, en se plaçant dans courseGIT, on crée un répertoire tp1.

On crée le dépôt Git avec : `git init`. Un répertoire _.git_ a aussi été créé.
	
####	2.1. La commande git status
	
La commande `git status` vérifie les modifications apportées aux fichiers.
	
### 3. Création d’un fichier texte README.md

####	3.1. Gérer les différentes modifications du fichier README.md

`git status` retourne que le fichier _README.md_ n'est pas encore suivi.
Pour qu'il soit sélectionner, il faut entrer la commande : `git add README.md`.
Ensuite, pour le valider, il faut entrer : `git commit -m "Ajoute du fichier README.md"`.
`git log` permet de voir les versions enregistrées dans les dépôt, chaque entrée du
log correspond à une version du fichier validé.

####	3.2. Différencier 3 états / 3 zones / 3 actions

Dans un dépôt Git, un fichier peut avoir trois états : Modifié, quand il y
a des modifications locales qui ne sont ni validées, ni sélectionnées.
Sélectionné, quand les modifications sont sélectionnées, mais pas validées.
Validé, quand il a été validé et qu'il est synchrone avec le serveur.
Ces états correspondent à trois zones dans Git : La copie de travail, le système
de fichier local où les fichiers sont modifiés.
La zone de sélection. Ainsi que le dépôt dans lequel les modifications sont
enregistrées sous forme de validations.
Le passage d'un état à un autre se fait par trois actions : Sélection qui
sélectionne les fichiers pour la validation (`git add`). La validation qui crée le
commit et l'envoie vers le dépôt (`git commit`). La récupération qui récupère un
instantané depuis le dépôt vers la copie de travail (`git checkout`).

####	Exercice


### 	4. Gestion de version d’un programme Java

On créé un répertoire _src_ qui contiendra les sources de _Cryptomonnaie.java_
que l'on créera avec `touch Cryptomonnaie.java`.
On va sélectionner le fichier _Cryptomonnaie.java_ avec `git add Cryptomonnaie.java`,
puis on va l'ajouter avec `git commit -m "Première version du fichier Cryptomonnaie.java"`.
On peut vérifier les informations sur les ajouts avec la commande : `git log`.

####	4.1. Création du fichier .gitignore
	
En compilant le fichier _Cryptomonnaie.java_, on remarque qu'il apparaît dans
le retour de `git status`. Il ne faut pas l'ajouter dans le dépôt, pour que git
l'ignore, il faut créer le fichier _.gitignore_. Ce fichier va apparaître dans
le retour de `git status`. Pour ignorer tous les fichier _.class_, on ajoute à
_.gitignore_ la ligne _*.class_, on sélectionne puis on ajoute le fichier au
dépôt (`git add .gitignore` et `git commit -m ".gitignore ajouté"`). Le fichier
ne figure plus dans `git status`.

####	Exercice
	
On peut modifier le fichier _.gitignore_, puis le sélectionner (`git add .gitignore`)
et l'ajouter à nouveau (`git commit -m ".gitignore mis à jour"`).


## TP 2 : Travailler en autonomie sur un depôt github distant

###	1. Créer un compte sur github

###	2. Ajouter une nouvelle clé SSH à votre compte GitHub

Il n'y a pas de clef dans le répertoire _.ssh_, il faut donc générer les clefs
avec la commande `ssh-keygen`

On peut ensuite copier la clef publique avec `cat ~/.ssh/id_rsa.pub`


###	3. Pousser un dépôt existant depuis la ligne de commande

`git remote` : gère les dépôts distants.
`git push` : met à jour le dépôt distant à partir de la dernière version validée
sur le dépôt local.
`git pull` : met à jour le dépôt local à partir de la dernière version du dépôt
distant.

Pour vérifier que le dépôt local est lié ou non à un dépôt distant, on utilise
la commande `git remote -v` depuis le dépôt local.
Pour lier le dépôt local au répertoire distant, on utilise la commande
`git remote add origin git@github.com:FrancoisLiziard/tp1.git`

Pour connaître le nom de la branche, il faut entrer `git branch`.

Pour créer le lien de façon permanante et pour mettre à jour le dépôt distant,
on entre `git push -u origin master`.


###	4. Séquence de travail avec un dépôt distant

On télécharge la version la plus récente du dépôt distant avec `git pull`. On
peut aussi voir les modifications les plus récentes avec `git log`.

On peut ensuite modifier les fichiers.

De plus, on synchronise le dépôt local au dépôt distant avec `git push`.

Exercice :
On entre `git pull`, puis `git log` avant de modifier le fichier
_Cryptomonnaie.java_. On peut ensuite taper `git status`, `git add Cryptomonnaie.java`,
`git commit -m "Ajout de getters et setters"` et `git push`.


###	5. Cloner un dépôt distant sur notre machine locale

Pour cloner un répertoire GitHub nouvellement créé, on clique sur _Code_.
Ensuite, on se place dans le répertoire courseGIT et on entre
`git clone git@github.com:FrancoisLiziard/tp2.git`. Cela a créé le répertoire
tp2 déjà synchronisé avec le dépôt distant.

####	Exercices :
1. On copie les fichier _src/Cryptomonnaie.java_ dans tp2, de même pour _README.md_.
2. En entre `git status`, `git add .`, `git commit -m "Copie du tp1 dans tp2"`,
`git pull` et `git push`.


## TP 3 : Travailler en équipe sur un dépôt GitHub distant

###	1. Inviter des collaborateurs dans un dépôt personnel

Pour travailler en équipe, on peut créer un nouveau dépôt _tp3_. On peut inviter
une personne en entrant son nom d'utilisateur ou son adresse mail. L'invitation
est reçue par la personne dans sa messagerie.
On peut ensuite cloner le dépôt avec `git clone git@github.com:FrancoisLiziard/tp3.git`.

####	Exercices :
1. Un des membres de l'équipe peut mettre à jour les fichiers du tp3 avec ceux 
du tp2 en utilisant les commandes `git status`, `git add .`, `git commit -m "tp3"`,
`git pull` et `git push`.

2. Le deuxième membre entre `git pull`.

3. Le contenu de GitHub correspond à celui du dépôt local.


###	2. Développement d’un projet java en équipe

Le dépôt du tp3 de chacun des membres est synchronisé.
Un des utilisateurs peut copier les nouveaux fichiers dans le répertoire _tp3/src_.
On peut ensuite les valider dans le dépôt local et le dépôt distant avec les
commandes `git status`, `git add .`, `git commit -m "Ajout des nouveaux fichiers"`, 
`git pull` et `git push -u origin master`. On remarque que le second utilisateur reçoit la 
dernière version du dépôt distant.

####	Exercices :
1. On a réalisée les étapes précédentes. Il faut ensuite synchroniser avec les
commandes `git status`, `git add .`, `git commit -m "Ajout des nouveaux fichiers complétés"`, `git pull` et `git push -u origin master`. On remarque que le second utilisateur reçoit la dernière version du dépôt distant.

###	3. Gérer des nouvelles fonctionnalités à l’aide des branches

####	3.1. Tester le concept de branche avec un exemple simple

La seule branche du dépôt est _* master_.
Il est possible de rendre l'affichage des modifications plus lisible avec
`git log --graph --oneline --all --decorate --topo-order`.

On peut créer une nouvelle branche avec la commande `git checkout -b test`.
checkout fait changer de branche et l'option -b permet de créer une nouvelle
branche. Pour changer de branche on peut entrer `git checkout <nom_branche>`.
Pour créer un fichier _test.txt_, on tape `touch test.txt`.
On peut ensuite valider les changements dans le dépôt local avec `git add test.txt`
et `git commit -m "fonction de test ajoutée"`. On peut revenir à la branche master
avec `git checkout master`.
On ajoute une nouvelle ligne au fichier _README.md_, on peut valider le changement
avec `git add README.md` et `git comit -m "nouveau commit sur la branche principale"`.
Pour voir les changements, on entre `git log --graph --oneline --all --decorate --topo-order`.

3.2. Fusionner la branche de test dans la branche principale

On peut fusionner les branches en se plaçant dans la branche principale et en
tapant `git merge test`. La commande `git log --graph --oneline --all --decorate --topo-order` nous permet de voir que les deux branches ont été fusionnées.
En tapant `ls`, on voit que le fichier _test.txt_ apparaît dans la branche
principale.

####	Exercices :
2. On supprime _test.txt_ du dépôt avec `git rm test.txt` et on valide avec
`git commit -m "test.txt supprimé"`.
3. On peut créer une nouvelle branche avec `git checkout -b AthosCoin` et un
autre membre tape `git checkout -b PorthosCoin`.
Il faudra créer dans chaque branche un fichier _PorthosCoin.java_ ou _AthosCoin.java_,
cela peut être fait avec `touch PorthosCoin` ou `touch AthosCoin`.
Il faut ensuite valider les modifications avec `git add AthosCoin.java`, puis
`git commit -m AthosCoin.java`.
On peut finir par fusionner les branches avec `git merge AthosCoin`.
On peut synchroniser les fichiers sur GitHub avec `git pull` et `git push -u origin  AthosCoin`.


## TP 4 : Résolution de conflits et pull request

###	1. Créer un conflit

On peut créer un nouveau dépôt _test-conflict_ directement sur GitHub et y créer le
fichier _README.md_.
On peut ensuite cloner le dépôt sur GitHub avec `git clone git@github.com:FrancoisLiziard/test-conflict.git`. Ensuite, on corrige une des deux fautes avec `git add .`, puis `git commit -m "Correction de deux"` et `git push`.
`git push` retourne une erreur : _error: impossible de pousser des références vers  'github.com:FrancoisLiziard/test-conflict.git'_. Cela se produit car le deuxième utilisateur a déjà corrigée et synchronisée une des erreurs. On entre "git pull". Il y a un conflit.


###	2. Résoudre un conflit

Pour déterminer le conflit, on tape `git diff`. Cette commande renvoie la ligne sur laquelle le conflit a eu lieu.
Il faut corriger le conflit en modifiant la ligne sur laquelle il a eu lieu. Ensuite, on
enregistre le fichier, on entre  `git status`, `git add README.md`, `git commit -m "Conflit README résolu"`, puis `git push`.


###	3. Un exemple simple de pull request

####	Exercice :
1. On commence par faire un fork du référentiel, ce qui nous permet de travailler avec une
copie. Ensuite, on clone clone ce référentiel dans notre répertoire _tp4_ avec `git clone git@github.com:FrancoisLiziard/test-pull-request-2022.git`.

2. On peut ensuite créer une branche thématique avec `git checkout -b pull-request-demo-FrancoisLiziard` dans le répertoire du référentiel. On peut ensuite synchroniser les
changements avec `git push origin pull-request-demo-FrancoisLiziard`.

3. 3. Modifications sur la branche _thématique pull-request-demo-<votre utilisateur>_ : On
peut obtenir le hash avec la commande `shasum`. On peut taper `echo "François Liziard" |  shasum`. Cette commande retourne le code de hachage suivant :
_09aafb58a36c8380006caf5ca477616e7f09e71c_.
On se place dans le répertoire _pr_users_ (`cd pr_users`), on créé un répertoire en utilisant le
code précédent (`mkdir 09aafb58a36c8380006caf5ca477616e7f09e71c`) et on se place dedans (`cd 09aafb58a36c8380006caf5ca477616e7f09e71c`). Ensuite, on peut créer un fichier texte avec le 
nom de l'utilisateur qui a créé et la date de création (`echo "Fichier crée par  FrancoisLiziard le $(date)" > filigrane.txt`).
Il ne reste plus qu'à synchroniser les modifications localement avec `git status`, `git  add filigrane.txt`, `git commit -m "Synchronisation du fichier filigrane"`. On synchronise 
ensuite la branche avec le répertoire distant avec `git push origin pull-request-demo- FrancoisLiziard`.

4. Faire une **pull request** : On peut initier une pull request en cliquant sur _Compare & pull request_ sur GitHub, puis sur _Create pull request_.

5. Accepter une pull request : Il est possible d'étudier une demande pull request avec les
onglets _Conversation_, _commits_, _files changed_, puis d'accepter avec _Merge pull  request_.


## TP 5 : Comment créer un site Web sur GitHub pages


###	1. Créer un site Web pour un référentiel existant

Pour créer un site web depuis un référentiel déjà existant, il faut se rendre à l'adresse
du référentiel du _tp3_. Pour créer un site web associé à un référentiel, il faut changer la
visibilité du référentiel en _public_ depuis _settings_, puis aller sur _Pages_ et choisir 
un thème.
On remarque qu'il n'est plus possible de sélectionner un thème ni de créer un fichier
_index.md_ dans GitHub. Il faudra donc le réaliser manuellement...
Il faut créer un fichier _index.md_ dans une branche _gh-pages_ avec `git checkout -b gh-pages`. Il faut ensuite créer un fichier _index.md_, `touch index.md` et le modifier.
On peut l'envoyer sur le référentiel avec `git status`, `git add index.md`, `git commit -m "Création de index.md"` et `git push -u origin gh-pages`.
Pour récupérer la branche distante, on entre `git fetch origin gh-pages`, puis `git 
checkout gh-pages`. On peut maintenant accéder au site à l'adresse **https://FrancoisLiziard.github.io/tp3/**.

###	2. Ajouter du contenu à l’aide de Markdown et HTML

En Markdown, il est possible d'ajouter des liens avec `[Link](lien du site)` et des images avec `[Image](lien de l'image)`.

####	Flux de travail

####	Exemples

###	3. Créer un site Web pour la SAE 2.03

####	Création du site web

1. Un des membres à créé le référentiel docker-sae203.
2. Tous les membres de l'équipe ont accès au référentiel.

On peut ajouter les fichiers dans le référentiel, puis entrer `git status`, les 
sélectionner avec `git add .`, on les valide avec `git commit -m "Ajout des comptes rendu des différents TP"`, enfin, on les synchronise avec GitHub avec `git push -u origin master`.
	
On place un fichier _index.md_, qui contient tous les rapports des TP, dans une branche _gh-pages_.
De plus, pour ajouter un thème, il nous faudra créer un fichier _yconfig.yml_, contenant :

`title: Midnight theme`
`description: Midnight is a theme for GitHub Pages.`
`show_downloads: true`
`google_analytics:`
`theme: jekyll-theme-midnight`

On peut accéder au site à l'adresse : [ryuuaz.github.io/docker-sae203/](https://ryuuaz.github.io/docker-sae203/)



## TP1 : Fonctionnement de base de Docker

### 2. Premières notions de Docker

Afin de voir quelle version de Docker est installée, on entre `docker --version`.
`Docker version 23.0.5, build bc4487a`
Docker permet de développer et de lancer des applications dans un conteneur.

On peut ensuite lancer un premier conteneur avec `docker run hello-world`. Cela
renvoie le résultat suivant :

Hello from Docker!
This message shows that your installation appears to be working correctly.

To generate this message, Docker took the following steps:
 1. The Docker client contacted the Docker daemon.
 2. The Docker daemon pulled the "hello-world" image from the Docker Hub.
    (amd64)
 3. The Docker daemon created a new container from that image which runs the
    executable that produces the output you are currently reading.
 4. The Docker daemon streamed that output to the Docker client, which sent it
    to your terminal.

To try something more ambitious, you can run an Ubuntu container with:
 $ docker run -it ubuntu bash

Share images, automate workflows, and more with a free Docker ID:
 https://hub.docker.com/

For more examples and ideas, visit:
 https://docs.docker.com/get-started/

Le premier évènement signifie que le client Docker a contacté la Docker daemon
pour recevoir l'image. Ensuite, le Docker daemon a téléchargée l'image `hello-world`
depuis le Docker Hub. Dans le troisième évènement, le Docker daemon a créée un
conteneur à partir de l'image, celle-ci a ensuite lancé un exécutable qui est
responsable du texte affiché. Enfin, le Docker daemon a envoyé le résultat au client
Docker qui l'a affiché sur le Terminal.

#### 2.1 Image Docker VS conteneur Docker

**Image Docker** : Il s'agit d'un fichier non modifiable contenant les fichiers
nécessaires à l'exécution d'une application. Une image ne peut être exécutée,
mais peut être utilisée comme modèle dans la création d'un conteneur.
**Conteneur Docker** : Il s'agit d'une image en cours d'éxécution, il peut être
modifié.

On peut voir la liste des machines en cours d'exécution avec `docker ps`. Cette
commande retourne `CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES`.

On peut aussi voir les conteneurs actifs ou arrêtés avec `docker ps -a`. Ce qui
renvoie `CONTAINER ID   IMAGE         COMMAND    CREATED          STATUS                      PORTS     NAMES`
`c5504d014e8e   hello-world   "/hello"   17 minutes ago   Exited (0) 17 minutes ago             elegant_franklin`.

Pour lister les images téléchargées sur la machine, on entre `docker images`. Le
résultat est `REPOSITORY    TAG       IMAGE ID       CREATED         SIZE
hello-world   latest    feb5d9fea6a5   19 months ago   13.3kB`.

#### 2.2. Images les plus populaires

On peut trouver les images les plus populaires sur [hub.docker.com](https://https://hub.docker.com/explore/).

### 3. Interactions avec les conteneurs Docker

#### 3.1. Conteneur en mode interactif

On peut lancer **alpine**, une version allégée de Linux avec le paramètre `ls` en
tapant : `docker run alpine ls`.
Le résultat est : 

Unable to find image 'alpine:latest' locally
latest: Pulling from library/alpine
f56be85fc22e: Pull complete 
Digest: sha256:124c7d2707904eea7431fffe91522a01e5a861a624ee31d03372cc1d138a3126
Status: Downloaded newer image for alpine:latest
bin
dev
etc
home
lib
media
mnt
opt
proc
root
run
sbin
srv
sys
tmp
usr
var

Il est plus utile d'employer le mode interactif avec `docker run -it alpine`.
On remarque que l'on peut à présent naviguer dans les différents répertoires du
conteneur.
On peut vérifier qu'il s'agit d'une instance de l'image alpine avec `cat /etc/os-release`.
Ce qui retourne :
`NAME="Alpine Linux"`
`ID=alpine`
`VERSION_ID=3.17.3`
`PRETTY_NAME="Alpine Linux v3.17"`
`HOME_URL="https://alpinelinux.org/"`
`BUG_REPORT_URL="https://gitlab.alpinelinux.org/alpine/aports/-/issues"`

On peut voir l'ensemble des conteneurs Docker avec `docker ps`, le résultat est :
`CONTAINER ID   IMAGE     COMMAND     CREATED         STATUS         PORTS     NAMES`
`73671abb9d2c   alpine    "/bin/sh"   6 minutes ago   Up 6 minutes             objective_bouman`
On peut interagir avec un conteneur déjà ouvert en tapant `docker exec -it objective_bouman /bin/sh`

#### 3.2. Ports, volumes et copie de fichiers

##### 3.2.1. Ports

Nous pouvons exécuter **httpd**, une image fournissant le service **HTTP apache**,
avec la commande `docker run httpd`. Ensuite, en entrant `localhost` dans la barre
de navigation d'un navigateur Web, on constate qu'il n'y a pas de service HTTP.

Afin de lancer un service accessible, il faut entrer `docker run --name httpd-FrancoisLiziard -d -p 8080:80 httpd`.
`--name httpd-FrançoisLiziard` correspond au nom du conteneur, `-d` permet d'exécuter
le conteneur en arrière-plan, `-p 8080:80` permet de mapper le port, avec `8080` 
représentant le port exposé sur la machine et `80` représentant le port du conteneur
et `httpd` correspond à l'image.
Cette commande retourne `9a4066d775d97ae3fa09dffe25be71fb3dba4169a2b3dd97c7d73818fe1e1681`.
Ensuite, on entre dans un navigateur Web, l'adresse `localhost:8080`, ce qui
affiche une page web.

##### 3.2.2. Copier des fichiers dans un conteneur en cours d’exécution

Pour copier un fichier ou un répertoire du conteneur vers la machine hôte avec
`docker cp nom_du_conteneur:/chemin/vers/le/contenu/ /chemin/vers/lequel/on/souhaite/copier`.
Afin de copier un fichier local vers le conteneur, nous tapons `docker cp ./fichier nom_du_conteneur:/`

Pour répondre à l'exercice, il faut tout d'abord créer le fichier `index.html`
avec son contenu. Ensuite, nous entrons dans le terminal, la commande `sudo docker cp ~/Bureau/courseGIT/index.html httpd-FrancoisLiziard:/usr/local/apache2/htdocs/index.html`
pendant que le conteneur est exécuté.
On peut ensuite remarquer en rechargeant la page, que son contenu a changé.
Le conteneur doit être arrêté, pour cela, on entre `docker stop httpd-FrancoisLiziard`.

##### 3.2.3. Volumes

On créé un répertoire html avec `mkdir html`, dans lequel on se place en entrant
`cd html`, il faut ensuite créer un fichier **index.html** avec `touch index.html`.
De plus, on tape la commande `docker run --name httpd-FrancoisLiziard -d -p 8080:80 -v $(pwd):/usr/local/apache2/htdocs httpd`.
`--name httpd-FrancoisLiziard` permet de nommer le conteneur.
`-d` permet d'exécuter le conteneur en arrière-plan.
`-p 8080:80` permet de mapper le port 80 du conteneur sur celui indiqué de l'hôte.
`-v $(pwd):/usr/local/apache2/htdocs` permet de créer un volume entre l'hôte et le
conteneur, à gauche de `:`, on indique le fichier à partager depuis l'hôte et à
droite, on indique le dossier contenant les pages web.
`httpd` représente l'image à lancer.

En ouvrant la page du conteneur, on remarque que le dossier html est synchronisé
avec le conteneur, il n'y a qu'à modifier le fichier **index.html** et les
changements se répercutent sur le conteneur.

## TP2 : Dockerfile pour la création d'images

Dockerfile permet de générer différents types d'images avec les caractéristiques
que nous souhaitons.

### 1. Introduction à Dockerfile

#### 1.1 Notre premier Dockerfile

Un fichier dockerfile est créé en précisant ce qui va dans l'environnement, à
l'intérieur du conteneur

##### 1.1.1. Structure de répertoires

On commence par créer le répertoire qui hébergera le dockerfile avec `mkdir premierDockerfile`. Nous pouvons y accéder avec `cd premierDockerfile`. Ensuite,
nous créons le fichier Dockerfile avec `touch Dockerfile` dans lequel on copie le
code suivant.

`# Utiliser l'image httpd officielle comme image parent`
`FROM httpd`

`# Copier le répertoire html du répertoire courant vers le répertoire de l'image /usr/.../htdocs`
`COPY ./html/ /usr/local/apache2/htdocs/`

`# Exécuter la commande echo sur le conteneur`
`# (il peut s'agir de n'importe quelle autre commande)`
`RUN echo 'Hello world! Voici notre premier dockerfile'`


`# Rendre le port 80 accessible au monde en dehors de ce conteneur`
`EXPOSE 80`

Nous devons ensuite créer un répertoire `html/` avec ` mkdir `html`. Pour y créer
un fichier `index.html`, on entre `touch index.html`, puis on peut créer la page web.
Après être retourné au dossier premierDockerfile, on remarque que `tree` retourne
l'arborescence correcte.

##### 1.1.2 Créer l'image et lancer le conteneur

Pour construire l'image à partir du dockerfile, nous entrons `docker build -t francois-liziard-httpd-img .`,
`docker build` indique la création d'une nouvelle image, `-t francois-liziard-httpd-img` et `.` indique le répertoire courant.
Nous pouvons ensuite lancer le serveur web avec `docker run --name httpd-FrancoisLiziardDockerfile -d -p 8080:80 francois-liziard-httpd-img`.
Après avoir entré `localhost:8080`, nous pouvons remarquer que l'application est
en cours d'exécution.
Le retour de `docker ps` correspond bien à :
`CONTAINER ID   IMAGE                        COMMAND              CREATED         STATUS         PORTS                                   NAMES`
`00f845c66d02   francois-liziard-httpd-img   "httpd-foreground"   2 minutes ago   Up 2 minutes   0.0.0.0:8080->80/tcp, :::8080->80/tcp   httpd-FrancoisLiziardDockerfile`

Pour arrêter le conteneur, nous tapons `docker stop 00f845c66d02`, puis `docker rm 00f845c66d02` afin de le supprimer.

#### 1.2. Installer un service apache à partir d’une image vierge debian

Nous pouvons observer que le dockerfile utilise une image **Debian** comme image
parent, dans le cas de la première ligne. Pour la ligne suivante, le dockerfile
télécharge des mises à jour, puis installe **apache2**. Dans le cas de la troisième
ligne, le contenu du répertoire `./html` est copié vers `/var/www/html` sur l'image.
L'instruction `EXPOSE 80` indique que le conteneur écoute le port 80. Enfin, à la cinquième ligne, `CMD` indique qu'une commande est exécutée entre crochet avec le
chemin absolu vers `apache2ctl`.

Il faut tout d'abord créer le répertoire servant à contenir le Dockerfile, créer
le fichier Dockerfile dans lequel on copie le code donné. Ensuite, nous créons
un sous-répertoire `/html` qui doit contenir un fichier `index.html`

Pour construire l'image à partir du dockerfile, nous entrons `docker build -t francois-liziard-apache-img .`.
Nous pouvons ensuite lancer le serveur web avec `docker run --name apache-FrancoisLiziardDockerfile -d -p 9000:80 francois-liziard-apache-img`.
Nous pouvons ensuite entrer dans la barre de navigation `localhost:9000`. On
arrête ensuite le conteneur avec `docker stop apache-FrancoisLiziardDockerfile`.

### 2. Dockerfile + github

On peut sauvegarder l'exercice de la section 1.1 dans un référentiel GitHub. Il faut
créer un dépôt sur la machine locale avec `git init`, ainsi qu'un dépôt vide sur
GitHub. Il faut ensuite lier les deux référentiels avec `git remote add origin git@github.com:FrancoisLiziard/premierDockerfile.git`, puis ajouter les fichier
avec `git add .`, `git commit -m "Ajout du premier dockerfile"` et `git push -u origin master`.


On peut déployer un exemple de Dockerfile avec `git clone git@github.com:juanluck/exempleDockerfile.git`, y accéder avec `cd exempleDockerfile`, construire l'image
décrite en tapant `docker build -t francois-liziard-httpd-img-ex .`, on lance le
serveur avec `docker run -d -p 8080:80 francois-liziard-httpd-img-ex` et on lance
en entrant `localhost:8080` dans un navigateur web.
On peut vérifier que le conteneur associé est actif avec `docker ps` qui renvoie :
`CONTAINER ID   IMAGE                           COMMAND              CREATED              STATUS              PORTS                                   NAMES`
`07d4879129b6   francois-liziard-httpd-img-ex   "httpd-foreground"   About a minute ago   Up About a minute   0.0.0.0:8080->80/tcp, :::8080->80/tcp   optimistic_edison`

On peut enfin arrêter le conteneur avec `docker stop optimistic_edison` et le
supprimer avec `docker rm optimistic_edison`.


De plus, nous pouvons déployer un serveur **LAMP** (Apache + MariaDB + PHP) sur
notre machine. Pour cela, il faut cloner le référentiel avec `git clone git@github.com:abderzah/lampDocker.git`, nous pouvons nous placer dans le référentiel
avec `cd lampDocker`, puis construire le conteneur avec `docker build -t debian-lamp .`,
lancer le service avec `docker run -p 8000:80 debian-lamp`, enfin nous vérifions
que l'application s'exécute en tapant `localhost:8000/index.php` dans un navigateur.

Concernant la structure des répertoire, nous pouvons remarquer que le répertoire `data`
contient un fichier SQL servant à créer la base de données et à y insérer des
valeurs. Ensuite, on trouve, dans le répertoire `html/`, un fichier `index.html`
servant à placer les différents élémnts et à définir leur style, nous obsrervons
de même un fichier `index.php` dont l'utilité est de rendre la page dynamique et
d'afficher les valeurs de la base de données dans un tableau HTML.
Dans le Dockerfile nous remarquons que l'image est basée sur celle de Debian. En
seconde ligne, le fichier installe des mises à jour, installe apache2, mariadb client
et serveur, PHP, PHP-MySQL et libapache2-mod-php. En troisième ligne, le fichier
copie le contenu du répertoire `html/` vers `/var/www//html` car il est destiné
à l'affichage pour l'utilisateur, les données et le script de lancement `start-script.sh`
sont aussi copiés vers, respectivement `/data` et `/root/`.
De plus, il y a deux ports sur lesquels le conteneur écoute. La commande `RUN chmod +x /root/start-script.sh` droits d'exécution à `start-script.sh`, puis l'exécute avec
`CMD ["/bin/bash", "/root/start-script.sh"]`

### 3. Un point sur Docker compose

Pour déployer un serveur **Docker Compose** afin de gérer plusieurs conteneurs.
Dans un premier temps, nous vérifions que Docker Compose est installé avec `docker-compose --version`, cela retourne `docker-compose version 1.25.0, build unknown`.
Dans un second temps, nous devons cloner le référenciel avec `git clone git@github.com:abderzah/docker_customer_catalog.git` et y accéder avec `cd`.
On peut accéder à l'application en entrant `localhost` dans un navigateur Web.
Ensuite, nous arrêtons l'application avec la commande `docker-compose down` et
il est possible de supprimer le conteneur arrêté avec `docker-compose rm` ou
`docker-compose rm [-fs] pour forcer sa suppression.`
	
