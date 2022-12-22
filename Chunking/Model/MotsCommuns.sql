--
-- Fichier g�n�r� par SQLiteStudio v3.3.3 sur jeu. d�c. 22 18:29:18 2022
--
-- Encodage texte utilis� : UTF-8
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table : mots
CREATE TABLE mots (mots STRING PRIMARY KEY, syllabe1 STRING, syllabe2 STRING, syllabe3 STRING, syllabe4 STRING);
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('accord�on', 'a', 'ccor', 'd�', 'on');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('calendrier', 'ca', 'len', 'dri', 'er');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('aspirateur', 'as', 'pi', 'ra', 'teur');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('cam�l�on', 'ca', 'm�', 'l�', 'on');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('crocodile', 'cro', 'co', 'di', 'le');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('dentifrice', 'den', 'ti', 'fri', 'ce');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('dinosaure', 'di', 'no', 'sau', 're');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('distributeur', 'dis', 'tri', 'bu', 'teur');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('harmonica', 'har', 'mo', 'ni', 'ca');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('imprimante', 'im', 'pri', 'man', 'te');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('�pouvantail', '�', 'pou', 'van', 'tail');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('macaroni', 'ma', 'ca', 'ro', 'ni');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('mariage', 'ma', 'ri', 'a', 'ge');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('m�dicament', 'm�', 'di', 'ca', 'ment');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('ordinateur', 'or', 'di', 'na', 'teur');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('parachute', 'pa', 'ra', 'chu', 'te');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('photographie', 'pho', 'to', 'gra', 'phie');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('rhinoc�ros', 'rhi', 'no', 'c�', 'ros');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('technologie', 'tech', 'no', 'lo', 'gie');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('tentacule', 'ten', 'ta', 'cu', 'le');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('trampoline', 'tram', 'po', 'li', 'ne');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('ventilateur', 'ven', 'ti', 'la', 'teur');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('apiculteur', 'a', 'pi', 'cul', 'teur');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('m�decine', 'm�', 'de', 'ci', 'ne');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('�tudiant', '�', 'tu', 'di', 'ant');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('ing�nieur', 'in', 'g�', 'ni', 'eur');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('m�canique', 'm�', 'ca', 'ni', 'que');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('avocate', 'a', 'vo', 'ca', 'te');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('boulangerie', 'bou', 'lan', 'ge', 'rie');
INSERT INTO mots (mots, syllabe1, syllabe2, syllabe3, syllabe4) VALUES ('pharmacien', 'phar', 'ma', 'ci', 'en');

-- Index : sqlite_autoindex_mots_1
CREATE INDEX sqlite_autoindex_mots_1 ON mots (mots COLLATE BINARY);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
