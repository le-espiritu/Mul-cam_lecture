#�Ż�ǰ����
INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000026', '�������ǽ�', 'CAT000000001', '������ıͿ���', 39800, '20210201', '20210201', '���� ��۸� �˴ϴ�.', 'Y', 'Y',  'dress_image6.gif', 'dress_image6.gif', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;
INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000027', 'üũ��ĿƮ', 'CAT000000003', 'üũ���̻���', 39800, '20210201', '20210201', '���� ��۸� �˴ϴ�.', 'Y', 'Y',  'bottom_image6.gif', 'bottom_image6.gif', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;
INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000028', '�������콺', 'CAT000000002', '��Ʈ����', 39800, '20210201', '20210201', '���� ��۸� �˴ϴ�.', 'Y', 'Y',  'top_image6.jpg', 'top_image6.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;


#member���̺� ����
alter table member
add (info varchar2(20));

update member
set info='normal';

commit;

#admin����
insert into member values('admin','admin','������','����',100000,'200',null,'admin');
commit;