-- usrテーブルへレコード追加
INSERT INTO usr (user_id, first_name, last_name, role_name, password)
VALUES ('jiroyamada@example.com', '次郎', '山田', 'USER', '$2b$12$/NaGMqU3yxcsWwsK.ljlhOC3IcWpxE90j09X22mMcDtoTgee9SYG2')/;
INSERT INTO usr (user_id, first_name, last_name, role_name, password)
VALUES ('saburoyamada@example.com', '三郎', '山田', 'USER', '$2b$12$zNvRSC969PCRBMWuFgb7zOXjtKqcAyWcKzf2hKJF1VlwDbCUl30q.')/;
INSERT INTO usr (user_id, first_name, last_name, role_name, password)
VALUES ('ichirosuzuki@example.com', '一郎', '鈴木', 'ADMIN', '$2b$12$VmxPXduieac/IA/4IDsMlelN7jBmmx2ze6/p1ZTn8usPiNEQTt8..')/;
-- meeting_roomテーブルへレコード追加
INSERT INTO meeting_room (room_name) VALUES ('マーキュリー')/;
INSERT INTO meeting_room (room_name) VALUES ('ビーナス')/;
INSERT INTO meeting_room (room_name) VALUES ('マーズ')/;
INSERT INTO meeting_room (room_name) VALUES ('ジュピター')/;
INSERT INTO meeting_room (room_name) VALUES ('サターン')/;
INSERT INTO meeting_room (room_name) VALUES ('ウラヌス')/;
INSERT INTO meeting_room (room_name) VALUES ('ネプチューン')/;
-- reservable_roomテーブルへレコード追加
DROP FUNCTION IF EXISTS REGISTER_RESERVABLE_ROOMS()/;
CREATE OR REPLACE FUNCTION REGISTER_RESERVABLE_ROOMS()
  RETURNS
    INT4 AS $$
DECLARE
  total INT4;
  i INT4;
  id INT4;
BEGIN
  total := 0;
  FOR id IN SELECT room_id
            FROM meeting_room LOOP
    i := 0;
    FOR i IN 0..373 LOOP
      INSERT INTO reservable_room (reserved_date, room_id)
      VALUES (CURRENT_DATE + i - 7, id);
    END LOOP;
    total := total + i;
  END LOOP;
  RETURN total;
END;
$$ LANGUAGE plpgsql
/;
SELECT REGISTER_RESERVABLE_ROOMS() /;
COMMIT /;