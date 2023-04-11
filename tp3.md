**Nom :** LIZIARD François
**Groupe :** C
**Année :** 1ère année
**IUT Le Havre - Cours GIT**

TP 3 : Travailler en équipe sur un dépôt GitHub distant

1. Inviter des collaborateurs dans un dépôt personnel

Pour travailler en équipe, on peut créer un nouveau dépôt tp3. On peut inviter
une personne en entrant son nom d'utilisateur ou son adresse mail. L'invitation
est reçue par la personne dans sa messagerie.
On peut ensuite cloner le dépôt avec "git clone git@github.com:FrancoisLiziard/
tp3.git".

Exercices :
1. Un des membres de l'équipe peut mettre à jour les fichiers du tp3 avec ceux 
du tp2 en utilisant les commandes "git status", "git add .", "git commit -m "tp3",
"git pull" et "git push".

2. Le deuxième memebre entre "git pull".

3. Le contenu de GitHub correspond à celui du dépôt local.


2. Développement d’un projet java en équipe

Le dépôt du tp3 de chacun des membres est synchronisé.
Un des utilisateurs peut copier les nouveaux fichiers dans le répertoire tp3/src.
On peut ensuite les valider dans le dépôt local et le dépôt distant avec les
commandes "git status", "git add .", "git commit -m "Ajout des nouveaux fichiers", 
"git pull" et "git push -u origin master". On remarque que le second utilisateur reçoit la 
dernière version du dépôt distant.

Exercices :
1. On a réalisée les étapes précédentes. Il faut ensuite synchroniser avec les
commandes "git status", "git add .", "git commit -m "Ajout des nouveaux fichiers
complétés", "git pull" et "git push -u origin master". On remarque que le second utilisateur
reçoit la dernière version du dépôt distant.

3. Gérer des nouvelles fonctionnalités à l’aide des branches

3.1. Tester le concept de branche avec un exemple simple

La seule branche du dépôt est "* master".
Il est possible de rendre l'affichage des modifications plus lisible avec
"git log --graph --oneline --all --decorate --topo-order".

On peut créer une nouvelle branche avec la commande "git checkout -b test".
checkout fait changer de branche et l'option -b permet de créer une nouvelle
branche. Pour changer de branche on peut entrer "git checkout <nom_branche>".
Pour créer un fichier test.txt, on tape "touch test.txt".
On peut ensuite valider les changements dans le dépôt local avec "git add test.txt"
et "git commit -m "fonction de test ajoutée"". On peut revenir à la branche master
avec "git checkout master".
On ajoute une nouvelle ligne au fichier README.md, on peut valider le changement
avec "git add README.md" et "git comit -m "nouveau commit sur la branche principale".
Pour voir les changements, on entre "git log --graph --oneline --all --decorate
--topo-order".

3.2. Fusionner la branche de test dans la branche principale

On peut fusionner les branches en se plaçant dans la branche principale et en
tapant "git merge test". La commande "git log --graph --oneline --all --decorate
--topo-order" nous permet de voir que les deux branches ont été fusionnées.
En tapant "ls", on voit que le fichier test.txt apparait dans la branche
principale.

Exercices :
2. On supprime test.txt du dépôt avec "git rm test.txt" et on valide avec
"git commit -m "test.txt supprimé".
3. On peut créer une nouvelle branche avec "git checkout -b AthosCoin" et un
autre membre tape "git checkout -b PorthosCoin".
Il faudra créer dans chaque branche un fichier PorthosCoin.java ou AthosCoin.java,
cela peut être fait avec "touch PorthosCoin" ou "touch AthosCoin".
Il faut ensuite valider les modifications avec "git add AthosCoin.java", puis
"git commit -m AthosCoin.java".
On peut finir par fusionner les branches avec "git merge AthosCoin".
On peut synchroniser les fichiers sur GitHub avec "git pull" et "git push -u origin 
AthosCoin".
