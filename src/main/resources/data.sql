INSERT INTO category (description, active) VALUES
    ('biscoito', 1),
    ('bebida', 1),
    ('grao', 1),
    ('massa', 1);

INSERT INTO brand (name, active) VALUES
    ('nestle', 1),
    ('cafe brasileiro', 1),
    ('camil', 1),
    ('adria', 1);

INSERT INTO product (active, brand_id, category_id, description, price, sku)
VALUES (1, 1, 1, 'trakinas', 2.90, '1s8hw3h7');
VALUES (1, 2, 2, 'cafe', 4.00, '2s8hw3h5');
VALUES (1, 3, 3, 'arroz', 8.00, '4s8hw3h9');
