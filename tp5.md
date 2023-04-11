**Nom :** LIZIARD François
**Groupe :** C
**Année :** 1ère année
**IUT Le Havre - Cours GIT**

TP 5 : Comment créer un site Web sur GitHub pages


1. Créer un site Web pour un référentiel existant

Pour créer un site web depuis un référentiel déjà existant, il faut se rendre à l'adresse
du référentiel du tp3. Pour créer un site web associé à un référentiel, il faut changer la
visibilité du référentiel en "public" depuis "settings", puis aller sur "Pages" et choisir 
un thème.
On remarque qu'il n'est plus possible de seélectionner un thème ni de créer un fichier
index.md dans GitHub. Il faudra donc le réaliser manuellement...
Il faut créer un fichier index.md dans une branche "gh-pages" avec "git checkout -b gh-
pages". Il faut ensuite créer un fichier index.md, "touch index.md" et le modifier.
On peut l'envoyer sur le référentiel avec "git status", "git add index.md", "git commit -m
"Création de index.md" et "git push -u origin gh-pages".
Pour récupérer la branche distante, on entre "git fetch origin gh-pages", puis "git 
checkout gh-pages". On peut maintenant accéder au site à l'adresse "https://FrancoisLiziard.
github.io/tp3/".

2. Ajouter du contenu à l’aide de Markdown et HTML

En Markdown, il est possible d'ajouter des liens avec "[Link](lien du site)" et des images avec
"[Image](lien de l'image)".

Flux de travail

Exemples

3. Créer un site Web pour la SAE 2.03

Création du site web

1. Un des memebres à créé le référentiel docker-sae203.
2. Tous les membres de l'équipe ont accés au référentiel.

On peut ajouter les fichiers dans le référentiel, puis entrer "git status", les 
sélectionner avec "git add .", on les valide avec "git commit -m "Ajout des comptes rendu 
des différents TP", enfin, on les synchronise avec GitHub avec "git push -u origin master".
