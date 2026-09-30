-- Dados de exemplo: usuarios e empresas (senha de todos: 123456)
-- Pode rodar mais de uma vez: e-mails e CNPJs repetidos sao ignorados

INSERT OR IGNORE INTO usuarios (nome, email, senha) VALUES
    ('Ana Souza', 'ana.souza@exemplo.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92'),
    ('Bruno Lima', 'bruno.lima@exemplo.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92'),
    ('Carla Mendes', 'carla.mendes@exemplo.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92'),
    ('TechSul Soluções', 'techsul@exemplo.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92'),
    ('Saúde Plus Clínica', 'saudeplus@exemplo.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92'),
    ('ConstruForte Engenharia', 'construforte@exemplo.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92');

INSERT OR IGNORE INTO empresas (usuario_id, nome, cnpj, area_atuacao, telefone, sobre)
    SELECT id, 'TechSul Soluções', '11222333000181', 'Tecnologia', '(51) 3000-1001', 'Desenvolvimento de software e suporte em TI para empresas do Sul.' FROM usuarios WHERE email = 'techsul@exemplo.com';

INSERT OR IGNORE INTO empresas (usuario_id, nome, cnpj, area_atuacao, telefone, sobre)
    SELECT id, 'Saúde Plus Clínica', '22333444000155', 'Saúde', '(51) 3000-2002', 'Clínica com atendimento médico e serviços de enfermagem.' FROM usuarios WHERE email = 'saudeplus@exemplo.com';

INSERT OR IGNORE INTO empresas (usuario_id, nome, cnpj, area_atuacao, telefone, sobre)
    SELECT id, 'ConstruForte Engenharia', '33444555000129', 'Engenharia', '(51) 3000-3003', 'Obras residenciais e comerciais com foco em segurança e prazo.' FROM usuarios WHERE email = 'construforte@exemplo.com';


INSERT OR IGNORE INTO candidatos (usuario_id, telefone, area_interesse, resumo)
    SELECT id, '(51) 99999-1001', 'Tecnologia', 'Desenvolvedora com foco em Java e bancos de dados.' FROM usuarios WHERE email = 'ana.souza@exemplo.com';

INSERT OR IGNORE INTO candidatos (usuario_id, telefone, area_interesse, resumo)
    SELECT id, '(51) 99999-2002', 'Saúde', 'Técnico de enfermagem com experiência em atendimento clínico.' FROM usuarios WHERE email = 'bruno.lima@exemplo.com';

INSERT OR IGNORE INTO candidatos (usuario_id, telefone, area_interesse, resumo)
    SELECT id, '(51) 99999-3003', 'Engenharia', 'Engenheira civil com experiência em acompanhamento de obras.' FROM usuarios WHERE email = 'carla.mendes@exemplo.com';
