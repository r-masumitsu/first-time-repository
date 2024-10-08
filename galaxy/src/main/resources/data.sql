-- usrテーブルへレコード追加
INSERT INTO usr (user_id, first_name, last_name, role_name, password)
VALUES ('taro-yamada', '太郎', '山田', 'USER', '$2a$10$oxSJl.keBwxmsMLkcT9lPeAIxfNTPNQxpeywMrF7A3kVszwUTqfTK')/;
INSERT INTO usr (user_id, first_name, last_name, role_name, password)
VALUES ('jiroyamada@example.com', '次郎', '山田', 'USER', '$2a$10$oxSJl.keBwxmsMLkcT9lPeAIxfNTPNQxpeywMrF7A3kVszwUTqfTK')/;
INSERT INTO usr (user_id, first_name, last_name, role_name, password)
VALUES ('saburoyamada@example.com', '三郎', '山田', 'USER', '$2a$10$oxSJl.keBwxmsMLkcT9lPeAIxfNTPNQxpeywMrF7A3kVszwUTqfTK')/;
INSERT INTO usr (user_id, first_name, last_name, role_name, password)
VALUES ('ichirosuzuki@example.com', '一郎', '鈴木', 'ADMIN', '$2a$10$oxSJl.keBwxmsMLkcT9lPeAIxfNTPNQxpeywMrF7A3kVszwUTqfTK')/;
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