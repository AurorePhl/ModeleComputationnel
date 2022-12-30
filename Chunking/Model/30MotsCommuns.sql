--
-- Fichier gÃ©nÃ©rÃ© par SQLiteStudio v3.3.3 sur ven. dÃ©c. 30 12:37:11 2022
--
-- Encodage texte utilisÃ© : UTF-8
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table : mots
CREATE TABLE mots (mots STRING, syllabe1 STRING, syllabe2 STRING, syllabe3 STRING, syllabe4 STRING, ID INT PRIMARY KEY);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('accordéon', 'ac', 'cor', 'dé', 'on', 1);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('appartement', 'ap', 'par', 'te', 'ment', 2);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('aspirateur', 'as', 'pi', 'ra', 'teur', 3);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('caméléon', 'ca', 'mé', 'lé', 'on', 4);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('crocodile', 'cro', 'co', 'di', 'le', 5);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('dentifrice', 'den', 'ti', 'fri', 'ce', 6);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('dinosaure', 'di', 'no', 'sau', 're', 7);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('distributeur', 'dis', 'tri', 'bu', 'teur', 8);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('harmonica', 'har', 'mo', 'ni', 'ca', 9);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('imprimante', 'im', 'pri', 'man', 'te', 10);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('épouvantail', 'é', 'pou', 'van', 'tail', 11);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('macaroni', 'ma', 'ca', 'ro', 'ni', 12);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('signature', 'si', 'gna', 'tu', 're', 13);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('médicament', 'mé', 'di', 'ca', 'ment', 14);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('ordinateur', 'or', 'di', 'na', 'teur', 15);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('parachute', 'pa', 'ra', 'chu', 'te', 16);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('photographie', 'pho', 'to', 'gra', 'phie', 17);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('rhinocéros', 'rhi', 'no', 'cé', 'ros', 18);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('libellule', 'li', 'bel', 'lu', 'le', 19);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('tentacule', 'ten', 'ta', 'cu', 'le', 20);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('trampoline', 'tram', 'po', 'li', 'ne', 21);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('ventilateur', 'ven', 'ti', 'la', 'teur', 22);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('apiculteur', 'a', 'pi', 'cul', 'teur', 23);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('médecine', 'mé', 'de', 'ci', 'ne', 24);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('charcuterie', 'char', 'cu', 'te', 'rie', 25);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('ingénieurie', 'in', 'gé', 'nie', 'rie', 26);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('mécanique', 'mé', 'ca', 'ni', 'que', 27);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('thermomètre', 'ther', 'mo', 'mè', 'tre', 28);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('boulangerie', 'bou', 'lan', 'ge', 'rie', 29);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4, ID) VALUES ('référentiel', 'ré', 'fé', 'ren', 'tiel', 30);

-- Index : sqlite_autoindex_mots_1
CREATE INDEX sqlite_autoindex_mots_1 ON mots (ID COLLATE BINARY);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
