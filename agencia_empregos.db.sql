BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "candidatos" (
	"id"	INTEGER,
	"usuario_id"	INTEGER NOT NULL UNIQUE,
	"telefone"	TEXT,
	"area_interesse"	TEXT,
	"resumo"	TEXT,
	PRIMARY KEY("id" AUTOINCREMENT),
	FOREIGN KEY("usuario_id") REFERENCES "usuarios"("id") ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS "candidaturas" (
	"id"	INTEGER,
	"candidato_id"	INTEGER NOT NULL,
	"vaga_id"	INTEGER NOT NULL,
	"data_candidatura"	TEXT NOT NULL DEFAULT (date('now', 'localtime')),
	"status"	TEXT NOT NULL DEFAULT 'Candidatura realizada' CHECK("status" IN ('Candidatura realizada', 'Em análise', 'Em processo seletivo', 'Resultado')),
	UNIQUE("candidato_id","vaga_id"),
	PRIMARY KEY("id" AUTOINCREMENT),
	FOREIGN KEY("candidato_id") REFERENCES "candidatos"("id") ON DELETE CASCADE,
	FOREIGN KEY("vaga_id") REFERENCES "vagas"("id") ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS "empresas" (
	"id"	INTEGER,
	"usuario_id"	INTEGER NOT NULL UNIQUE,
	"nome"	TEXT NOT NULL,
	"cnpj"	TEXT NOT NULL UNIQUE,
	"area_atuacao"	TEXT,
	"telefone"	TEXT,
	"sobre"	TEXT,
	PRIMARY KEY("id" AUTOINCREMENT),
	FOREIGN KEY("usuario_id") REFERENCES "usuarios"("id") ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS "processos_seletivos" (
	"id"	INTEGER,
	"candidatura_id"	INTEGER NOT NULL UNIQUE,
	"situacao"	TEXT NOT NULL DEFAULT 'Em andamento' CHECK("situacao" IN ('Em andamento', 'Aprovado', 'Reprovado')),
	"observacao"	TEXT,
	PRIMARY KEY("id" AUTOINCREMENT),
	FOREIGN KEY("candidatura_id") REFERENCES "candidaturas"("id") ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS "usuarios" (
	"id"	INTEGER,
	"nome"	TEXT NOT NULL,
	"email"	TEXT NOT NULL UNIQUE,
	"senha"	TEXT NOT NULL,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "vagas" (
	"id"	INTEGER,
	"empresa_id"	INTEGER NOT NULL,
	"titulo"	TEXT NOT NULL,
	"descricao"	TEXT,
	"area"	TEXT NOT NULL,
	"cidade"	TEXT,
	"salario"	REAL CHECK("salario" IS NULL OR "salario" >= 0),
	PRIMARY KEY("id" AUTOINCREMENT),
	FOREIGN KEY("empresa_id") REFERENCES "empresas"("id") ON DELETE CASCADE
);
CREATE INDEX IF NOT EXISTS "idx_vagas_area" ON "vagas" (
	"area"
);
COMMIT;
