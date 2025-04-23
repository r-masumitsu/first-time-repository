-- ユーザー情報の登録
INSERT INTO users (name, password) VALUES 
('ケニー', '$2a$10$lNH4dLsCH4/g7aZZq14QG.PvnC7rkeN395ZWanW/hTOi5k6y009mm'), -- ケニーのアカウント
('ポニー', '$2a$10$/jar9xXQ6lrnVjLvLGv5BepFkLnGIO49RrGx42p2i.1hQt1BZ/7E2'); -- ポニーのアカウント

-- クイズ情報の登録
INSERT INTO quiz (question, option1, option2, option3, option4, answer, author_name, genre, description) VALUES 
('太陽はどの天体に分類されるか？', '惑星', '恒星', '衛星', '小惑星', 2, 'ケニー', '天文学', '太陽は自ら光を放つ「恒星」に分類され、地球を含む惑星を引きつけています。'), 
-- 正解: 恒星（option2）

('ピタゴラスの定理はどのような図形に関する定理か？', '円', '三角形', '四角形', '多角形', 2, 'ケニー', '数学', 'ピタゴラスの定理は直角三角形に関する定理で、「a² + b² = c²」の関係を示します。'),
-- 正解: 三角形（option2）

('シェイクスピアの代表作の一つである「ハムレット」に登場する有名なセリフは？', 
 'To be, or not to be', 
 'All the world’s a stage', 
 'Et tu, Brute?', 
 'I think, therefore I am', 
 1, 'ポニー', '文学','「To be, or not to be」はハムレットが人生の意味を問う、最も有名なセリフの一つです。'),
-- 正解: To be, or not to be（option1）

('日本の首都はどこか？', '大阪', '京都', '東京', '福岡', 3, 'ポニー', '地理', '日本の首都は東京で、1868年に江戸から改称されました。');
-- 正解: 東京（option3）