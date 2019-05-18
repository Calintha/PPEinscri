Insert Into COMPETITION (Num_Competition, Nom_Competition, DateCloture_Comp)
Values
(1, 'tournoi de basket', '2018/12/01'),
(2, 'tennis de table', '2019/01/01');

Insert Into CANDIDAT (Num_Candidat, Nom_Candidat)
VALUES
(1, 'Calvin'),
(2, 'Xav'),
(3, 'Bleu'),
(4, 'Rouge'),
(5, 'Jaune');

Insert Into CONSTITUER (Num_Candidat, Num_Competition)
VALUES
(4, 1),
(3, 1),
(5, 2),
(1, 2),
(3, 2);

Insert Into PERSONNE (Num_Candidat, Prenom_Personne, Mail_Personne, Nom_Candidat)
VALUES
(1, 'Calvin', 'cal@gmail.com', 'cali'),
(2, 'Xav', 'xav@gmail.com', 'vert'),
(3, 'Sana', 'sana@gmail.com', 'vert'),

Insert Into EQUIPE (Num_Candidat, Nom_Candidat)
VALUES
(4, 'Bleu'),
(5, 'Rouge');

Insert Into COMPOSER (Num_Candidat, Num_Candidat_PERSONNE)
VALUES
(4, 1),
(4, 2),
(5, 2);