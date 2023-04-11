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

####	1.2 Editeur

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

####	4.1. Creation du fichier .gitignore
	
En compilant le fichier _Cryptomonnaie.java_, on remarque qu'il apparait dans
le retour de `git status`. Il ne faut pas l'ajouter dans le dépôt, pour que git
l'ignore, il faut créer le fichier _.gitignore_. Ce fichier va apparaitre dans
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

2. Le deuxième memebre entre `git pull`.

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
En tapant `ls`, on voit que le fichier _test.txt_ apparait dans la branche
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
On peut ensuite cloner le dépôt sur GitHub avec `git clone git@github.com:FrancoisLiziard/test-conflict.git`. Ensuite, on courrige une des deux fautes avec `git add .`, puis `git commit -m "Correction de deux"` et `git push`.
`git push` retourne une erreur : _error: impossible de pousser des références vers  'github.com:FrancoisLiziard/test-conflict.git'_. Cela se produit car le deuxième utilisateur a déjà corrigée et synchronysée une des erreurs. On entre "git pull". Il y a un conflit.


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
On remarque qu'il n'est plus possible de seélectionner un thème ni de créer un fichier
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

1. Un des memebres à créé le référentiel docker-sae203.
2. Tous les membres de l'équipe ont accés au référentiel.

On peut ajouter les fichiers dans le référentiel, puis entrer `git status`, les 
sélectionner avec `git add .`, on les valide avec `git commit -m "Ajout des comptes rendu des différents TP"`, enfin, on les synchronise avec GitHub avec `git push -u origin master`.
	
On place un fichier _index.md_, qui contient tous les rapports des TP, dans une branche _gh-pages_.
De plus, pour ajouter un thème, il nous faudra créer un fichier _yconfig.yml_, contenant :

`title: Midnight theme`
`description: Midnight is a theme for GitHub Pages.`
`show_downloads: true`
`google_analytics:`
`theme: jekyll-theme-midnight`

On peut accéder au site à l'adresse : [Link](https://ryuuaz.github.io/docker-sae203/)
