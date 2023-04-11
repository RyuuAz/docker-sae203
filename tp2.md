**Nom :** LIZIARD François
**Groupe :** C
**Année :** 1ère année
**IUT Le Havre - Cours GIT**

TP 2 : Travailler en autonomie sur un depôt github distant

1. Créer un compte sur github

2. Ajouter une nouvelle clé SSH à votre compte GitHub

Il n'y a pas de clef dans le répertoire .ssh, il faut donc générer les clefs
avec la commande ssh-keygen

On peut ensuite copier la clef publique avec cat ~/.ssh/id_rsa.pub


3. Pousser un dépôt existant depuis la ligne de commande

git remote : gère les dépôts distants.
git push : met à jour le dépôt distant à partir de la dernière version validée
sur le dépôt local.
git pull : met à jour le dépôt local à partir de la dernière version du dépôt
distant.

Pour vérifier que le dépôt local est lié ou non à un dépôt distant, on utilise
la commande "git remote -v" depuis le dépôt local.
Pour lier le dépôt local au répertoire distant, on utilise la commande
"git remote add origin git@github.com:FrancoisLiziard/tp1.git"

Pour connaître le nom de la branche, il faut entrer "git branch".

Pour créer le lien de façon permanante et pour mettre à jour le dépôt distant,
on entre "git push -u origin master".


4. Séquence de travail avec un dépôt distant

On télécharge la version la plus récente du dépôt distant avec "git pull". On
peut aussi voir les modifications les plus récentes avec "git log".

On peut ensuite modifier les fichiers.

De plus, on synchronise le dépôt local au dépôt distant avec "git push".

Exercice :
On entre "git pull", puis "git log" avant de modifier le fichier
Cryptomonnaie.java. On peut ensuite taper "git status", "git add 
Cryptomonnaie.java", "git commit -m "Ajout de getters et setters" et "git push".


5. Cloner un dépôt distant sur notre machine locale

Pour cloner un répertoire GitHub nouvellement créé, on clique sur "Code".
Ensuite, on se place dans le répertoire courseGIT et on entre
"git clone git@github.com:FrancoisLiziard/tp2.git". Cela a créé le répertoire
tp2 déjà synchronisé avec le dépôt distant.

Exercices :
1. On copie les fichier src/Cryptomonnaie.java dans tp2, de même pour README.md.
2. En entre "git status", "git add .", "git commit -m "Copie du tp1 dans tp2",
"git pull" et "git push".
