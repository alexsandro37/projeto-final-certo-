PRAGMA foreign_keys = ON;

CREATE TABLE IF NOT EXISTS usuarios (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    senha TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS candidatos (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    usuario_id INTEGER NOT NULL UNIQUE,
    telefone TEXT,
    area_interesse TEXT,
    resumo TEXT,
    FOREIGN KEY (usuario_id) REFERENCES usuarios (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS empresas (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    usuario_id INTEGER NOT NULL UNIQUE,
    nome TEXT NOT NULL,
    cnpj TEXT NOT NULL UNIQUE,
    area_atuacao TEXT,
    telefone TEXT,
    sobre TEXT,
    FOREIGN KEY (usuario_id) REFERENCES usuarios (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS vagas (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    empresa_id INTEGER NOT NULL,
    titulo TEXT NOT NULL,
    descricao TEXT,
    area TEXT NOT NULL,
    cidade TEXT,
    salario REAL CHECK (salario IS NULL OR salario >= 0),
    FOREIGN KEY (empresa_id) REFERENCES empresas (id) ON DELETE CASCADE
);

CREATE INDEX IF NOT EXISTS idx_vagas_area ON vagas (area);

CREATE TABLE IF NOT EXISTS candidaturas (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    candidato_id INTEGER NOT NULL,
    vaga_id INTEGER NOT NULL,
    data_candidatura TEXT NOT NULL DEFAULT (date('now', 'localtime')),
    status TEXT NOT NULL DEFAULT 'Candidatura realizada'
        CHECK (status IN ('Candidatura realizada', 'Em análise', 'Em processo seletivo', 'Resultado')),
    UNIQUE (candidato_id, vaga_id),
    FOREIGN KEY (candidato_id) REFERENCES candidatos (id) ON DELETE CASCADE,
    FOREIGN KEY (vaga_id) REFERENCES vagas (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS processos_seletivos (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    candidatura_id INTEGER NOT NULL UNIQUE,
    situacao TEXT NOT NULL DEFAULT 'Em andamento'
        CHECK (situacao IN ('Em andamento', 'Aprovado', 'Reprovado')),
    observacao TEXT,
    FOREIGN KEY (candidatura_id) REFERENCES candidaturas (id) ON DELETE CASCADE
);
