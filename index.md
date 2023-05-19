**Noms :** LIZIARD François, GALMANT Maxime, BATILDE Sacha, HANAK Valentin
**Groupe :** C
**Année :** 1ère année
**IUT Le Havre - Cours GIT**

# Guide d'utilisation du projet 
	
## Les différentes étapes a suivre

1. Installez Docker sur votre machine. Vous pouvez télécharger Docker à partir du site officiel et suivre les instructions d'installation pour votre système d'exploitation.

2. Ouvrez une fenêtre de terminal ou de ligne de commande et placez-vous dans le répertoire Projet .

3. Exécutez la commande suivante pour créer l'image Docker : `docker build -t nom_image .`

Assurez-vous de remplacer "nom_image" par le nom que vous souhaitez donner à votre image. Le point à la fin de la commande indique que le contexte de construction est le répertoire courant.

4. Une fois que la construction de l'image est terminée, vous pouvez exécuter un conteneur basé sur cette image en utilisant la commande suivante : `docker run -p port_local:port_conteneur nom_image:tag.`
	
5. Ouvrez une nouvelle fenêtre de terminal ou de ligne de commande et placez-vous dans le répertoire JAVA .

6. Exécutez la commande suivante pour créer l'image Docker : `javac *.java .`

7. Exécutez la commande suivante pour créer l'image Docker : `java Init.java .`

Cette commance vous ouvrira une fenêtre vous permettant de rentrez un pseudonyme. Une fois votre pseudo rentré, une nouvelle fenêtre s'ouvrira.

Dans cette fenêtre il faudra renseigner votre adresse IP car le serveur est hebergé en local host.

Pour cela, ouvrez une nouvelle fenêtre de terminal et exeutez la commande : 
`ipconfig` sous windows ou `curl if config.me` sous Linux.

Une fois l'adresse IP renseignée, vous accederez a une chatbox et vous pourrez discuter avec d'autre personne.


Pour tester avec plusieurs utilisateurs, ouvrez une nouvelle fenêtre de terminal et reprenez à partir de `l'étape 7`
