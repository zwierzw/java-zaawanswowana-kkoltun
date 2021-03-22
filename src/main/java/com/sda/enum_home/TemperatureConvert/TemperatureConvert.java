package com.sda.enum_home.TemperatureConvert;

public enum TemperatureConvert {
    C_F('C', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn * 9 / 5 + 32;
        }
    }),

    C_K('C', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn + 273.15f;
        }
    }),
    K_C('K', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn - 273.15f;
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) * 5 / 9;
        }
    }),
    F_K('F', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) * 5 / 9 + 273.15f;
        }
    }),
    K_F('K', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return 1.8f * (tempIn - 273.15f) + 32;
        }
    });

    private char tempIn;
    private char tempOut;
    private Converter converter;


    TemperatureConvert(char tempIn, char tempOut, Converter converter) {
        this.tempIn = tempIn;
        this.tempOut = tempOut;
        this.converter = converter;
    }


    public static void convertTemperature(char tempIn, char tempOut, float temp) {
        for (TemperatureConvert tc : TemperatureConvert.values()) {
            if (tempIn == tc.tempIn && tempOut == tc.tempOut) {
                System.out.println(tc.converter.convert(temp));
            }
        }


    }
}
