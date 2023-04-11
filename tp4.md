**Nom :** LIZIARD François
**Groupe :** C
**Année :** 1ère année
**IUT Le Havre - Cours GIT**

TP 4 : Résolution de conflits et pull request

1. Créer un conflit

On peut créer un nouveau dépôt test-conflict directement sur GitHub et y créer le
fichier README.md.
On peut ensuite cloner le dépôt sur GitHub avec "git clone git@github.com:FrancoisLiziard/
test-conflict.git". Ensuite, on courrige une des deux fautes avec "git add .", puis "git commit -m "Correction de deux"" et "git push".
"git push" retourne une erreur : "error: impossible de pousser des références vers 
'github.com:FrancoisLiziard/test-conflict.git'". Cela se produit car le deuxième utilisateur
a déjà corrigée et synchronysée une des erreurs. On entre "git pull". Il y a un conflit.


2. Résoudre un conflit

Pour déterminer le conflit, on tape "git diff". Cette commande renvoie la ligne sur laquelle
le conflit a eu lieu.
Il faut corriger le conflit en modifiant la ligne sur laquelle il a eu lieu. Ensuite, on
enregistre le fichier, on entre "git status", "git add README.md", "git commit -m
"Conflit README résolu"", puis "git push".


3. Un exemple simple de pull request

Exercice :
1. On commence par faire un fork du référentiel, ce qui nous permet de travailler avec une
copie. Ensuite, on clone clone ce référentiel dans notre répertoire tp4 avec "git clone 
git@github.com:FrancoisLiziard/test-pull-request-2022.git".

2. On peut ensuite créer une branche thématique avec "git checkout -b pull-request-demo
-FrancoisLiziard" dans le répertoire du référentiel. On peut ensuite synchroniser les
changements avec "git push origin pull-request-demo-FrancoisLiziard".

3. 3. Modifications sur la branche thématique pull-request-demo-<votre_utilisateur> : On
peut obtenir le hash avec la commande shasum. On peut taper "echo "François Liziard" | 
shasum". Cette commande retourne le code de hachage suivant :
"09aafb58a36c8380006caf5ca477616e7f09e71c".
On se place dans le répertoire pr_users (cd pr_users), on créé un répertoire en utilisant le
code précédent (mkdir 09aafb58a36c8380006caf5ca477616e7f09e71c) et on se place dedans (cd
09aafb58a36c8380006caf5ca477616e7f09e71c). Ensuite, on peut créer un fichier texte avec le 
nom de l'utilisateur qui a créé et la date de création (echo "Fichier crée par 
FrancoisLiziard le $(date)" > filigrane.txt).
Il ne reste plus qu'à synchroniser les modifications localement avec "git status", "git 
add filigrane.txt", "git commit -m "Synchronisation du fichier filigrane"". On synchronise 
ensuite la branche avec le répertoire distant avec "git push origin pull-request-demo-
FrancoisLiziard".

4. Faire une pull request : On peut initier une pull request en cliquant sur "Compare &
pull request" sur GitHub, puis sur "Create pull request".

5. Accepter une pull request : Il est possible d'étudier une demande pull request avec les
onglets "Conversation", "commits", "files changed", puis d'accepter avec "Merge pull 
request".
