INSERT INTO modalidades (nome)
VALUES ('MUSCULACAO'),
       ('FUNCIONAL'),
       ('JIU-JITSU'),
       ('MUAY THAI'),
       ('PILATES');

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'MENSAL', 120.00
FROM modalidades
WHERE nome = 'MUSCULACAO';

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'TRIMESTRAL', 330.00
FROM modalidades
WHERE nome = 'MUSCULACAO';

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'MENSAL', 150.00
FROM modalidades
WHERE nome = 'FUNCIONAL';

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'MENSAL', 180.00
FROM modalidades
WHERE nome = 'JIU-JITSU';

INSERT INTO graduacoes (modalidade_id, nome)
SELECT id, 'FAIXA BRANCA'
FROM modalidades
WHERE nome = 'JIU-JITSU';

INSERT INTO graduacoes (modalidade_id, nome)
SELECT id, 'FAIXA AZUL'
FROM modalidades
WHERE nome = 'JIU-JITSU';

INSERT INTO graduacoes (modalidade_id, nome)
SELECT id, 'FAIXA ROXA'
FROM modalidades
WHERE nome = 'JIU-JITSU';