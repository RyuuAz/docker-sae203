**Nom :** LIZIARD François
**Groupe :** C
**Année :** 1ère année
**IUT Le Havre - Cours GIT**

TP 1 : Travailler sur un répertoire local

1. Configuration de git

	On utilise la commande "git config --list" pour obtenir la configuration
actuelle.

	1.1 Identité

	Pour modifier respectivement le nom d'utilisateur et le mail, on entre :
"git config --global user.name "François Liziard"" et "git config --global
user.email francois.liziard@etu.univ-lehavre.fr"

	1.2 Editeur

	Pour configurer l'éditeur par défaut : "git config --global core.editor gedit"

	Exercices
	
	On entre à la suite :
-> git config --global user.name "François Liziard"
-> git config --global user.email francois.liziard@etu.univ-lehavre.fr
-> git config --global core.editor gedit

-> git config --list
On remarque que les informations ont été mises à jour :

user.name=François Liziard
user.email=francois.liziard@etu.univ-lehavre.fr
core.editor=gedit

-> git config user.name
Retourne : "François Liziard"

-> git config user.email
Retourne : francois.liziard@etu.univ-lehavre.fr


2. Création d'un dépôt git sur une machine locale

	On crée, tout d'abord un répertoire courseGIT avec la commande : "mkdir courseGIT".
Puis, en se plaçant dans courseGIT, on crée un répertoire tp1.

	On crée le dépôt Git avec : "git init". Un répertoire ".git" a aussi été créé.
	
	2.1. La commande git status
	
	La commande "git status" vérifie les modifications apportées aux fichiers.
	
3. Création d’un fichier texte README.md

	3.1. Gérer les différentes modifications du fichier README.md

	"git status" retourne que le fichier README.md n'est pas encore suivi.
Pour qu'il soit sélectionner, il faut entrer la commande : "git add README.md".
Ensuite, pour le valider, il faut entrer : "git commit -m "Ajoute du fichier README.md"".
"git log" permet de voir les versions enregistrées dans les dépôt, chaque entrée du
log correspond à une version du fichier validé.

	3.2. Différencier 3 états / 3 zones / 3 actions

	Dans un dépôt Git, un fichier peut avoir trois états : Modifié, quand il y
a des modifications locales qui ne sont ni validées, ni sélectionnées.
Sélectionné, quand les modifications sont sélectionnées, mais pas validées.
Validé, quand il a été validé et qu'il est synchrone avec le serveur.
	Ces états correspondent à trois zones dans Git : La copie de travail, le système
de fichier local où les fichiers sont modifiés.
La zone de sélection. Ainsi que le dépôt dans lequel les modifications sont
enregistrées sous forme de validations.
	Le passage d'un état à un autre se fait par trois actions : Sélection qui
sélectionne les fichiers pour la validation (git add). La validation qui crée le
commit et l'envoie vers le dépôt (git commit). La récupération qui récupère un
instantané depuis le dépôt vers la copie de travail (git checkout).

	Exercice


4. Gestion de version d’un programme Java

	On créé un répertoire "src" qui contiendra les sources de "Cryptomonnaie.java"
que l'on créera avec touch Cryptomonnaie.java".
On va sélectionner le fichier Cryptomonnaie.java avec "git add Cryptomonnaie.java",
puis on va l'ajouter avec "git commit -m "Première version du fichier Cryptomonnaie.java".
On peut vérifier les informations sur les ajouts avec la commande : "git log".

	4.1. Creation du fichier .gitignore
	
	En compilant le fichier Cryptomonnaie.java, on remarque qu'il apparait dans
le retour de "git status". Il ne faut pas l'ajouter dans le dépôt, pour que git
l'ignore, il faut créer le fichier ".gitignore". Ce fichier va apparaitre dans
le retour de "git status". Pour ignorer tous les fichier ".class", on ajoute à
".gitignore" la ligne "*.class", on sélectionne puis on ajoute le fichier au
dépôt ("git add .gitignore" et "git commit -m ".gitignore ajouté"). Le fichier
ne figure plus dans "git status".

	Exercice
	
	On peut modifier le fichier ".gitignore", puis le sélectionner ("git add .gitignore")
et l'ajouter à nouveau ("git commit -m ".gitignore mis à jour"").
