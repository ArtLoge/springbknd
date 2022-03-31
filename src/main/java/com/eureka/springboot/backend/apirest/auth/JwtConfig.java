package com.eureka.springboot.backend.apirest.auth;

public class JwtConfig {
    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
    public static final String RCA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEowIBAAKCAQEA3OnPsBKueu/aKbubY70f1ysE+ZyU0H0vB/ADToN1mqXBEprG\n" +
            "2Di5Oz3s/SIXUOdWjHZD3oW4Zm8ii+umCLvwzjGeQ+oV/9YHlS4pl6CqVytsjCcu\n" +
            "PTZdwN84zdrir+sr+1uF7+dTQAiQaS3MWasZ0dKkdPvtWUjY4qln2iwscG+GVR7L\n" +
            "3zTg6g9T/3Sf5ss/g6bzODsDEdZQGwIa7Y+CIl33W4zze66SWwQDtCOVxfZ5N734\n" +
            "knSS0VW96AHBBcIB8gTnL+SPk0VS6WeUms+TRgg4lDdjKnS44M3vW4J045tvb4YO\n" +
            "dgZW8BIRgXuQaiGnWU+oKk/QjClLiDdMa3E+eQIDAQABAoIBABi+w/nYDd1NcqWM\n" +
            "EzrX23Ixqmv/Yxf7fcIo22X3CbxZ5sebuLxNlkoRhLNSF0SDtUkkkjOhzOcEed0s\n" +
            "dzuxOacPHchDt1Uh91V5h0UpxQrgnVcRqHdI2LWbC3TbmNrVv+Z2+QjHY6bfjrWJ\n" +
            "YMOGi+zZ6HwGIC8JHuo8yZpBqnSphB1oQpjzssL51fx1r9sj3tpcd45jQY46Np2z\n" +
            "JSTaKG9khD5nPFJ4hYBP9uVX0Lq7uWWTyMWijGI8CaWaPGnTHAeAIHEJ46J/bQJE\n" +
            "hivkH89GSSNN4vvJvfRj2tcbtbL1DfoJDjRwAXDk92VVYzqrJTCUbpkhFg+LB7uu\n" +
            "fjl6KGUCgYEA8TLtMH0QXbEURsgUOhU7v3KqcXefeuaIvwTsTzzzIZqOBi4GX4DD\n" +
            "pUmq+CHZ/zQO3dSm2z6NOsn65E21oifJqhS13FS6DLCdU6vy3dAymLy42eYy1NX7\n" +
            "5sJWRLaXJPJZsG/i9YHUc3719ZtC/FNC02CeH3DzaeY4GOQSPjk6728CgYEA6ng2\n" +
            "I+b/PmU2lJ3PEox8xh4NbEahLunJDmL81RIarPysEiKg84qZL4GEUJvIatr7YA7m\n" +
            "xNdcwmXYU2zlsvgSSyZKr3L9bq49lTzqC41mwxwe2P4MtMVdPtjnN1JbQpkJo2lD\n" +
            "4wYK1dhRjwDfCnHx1qqOntBRccApyVX8vvdwPJcCgYA+ws6fKFvC1Vn+VP+WYYIL\n" +
            "fe3F2qef1i7M7Z4DvEtTeiDskLtNzHacIsAfEsfjtQsNQ9ErCWq8WmQzVdkmWY4K\n" +
            "+Jqdu1oyBR7a78ohV5Ri0/CRmmmtogSK9hR2isBnd7xIwcRft6mtZ+LeRsk2WP/x\n" +
            "epmKetyLuMDuESKCGGgydwKBgAqnf75N5tdM/hfuu9QZ8imGgBGle/mHwg0XTmnY\n" +
            "MsIdkSwZyrqGV8Oi3QJUsdy5KqcIxk+3gY2L1zKjRiTFxP8JNGeYkA+Rd1bqt6/i\n" +
            "swK2qmgt0yH7ver3LDqFUYRLM/bq95y/T4q8E6it33S4DMc2ZNiumqTSmJN/hsae\n" +
            "s8jtAoGBAKdS4zwCnvXLly0+w0ZXy7gZNk5r9cV2U2ZFYkz1ZB5rc6g5bfgHAKDE\n" +
            "/SJPx9LGSLWyqLUAqxsCeB2yhMwzIyIDKDL+Vqlu8pkEknJCgMlnzQuP9G1ZjC3u\n" +
            "3J6wFRCqHWfEm9Z6HTnIkqfr/+Ofv6inv78D9FeA1a5bTsgkfmQC\n" +
            "-----END RSA PRIVATE KEY-----";
    public static final String RCA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3OnPsBKueu/aKbubY70f\n" +
            "1ysE+ZyU0H0vB/ADToN1mqXBEprG2Di5Oz3s/SIXUOdWjHZD3oW4Zm8ii+umCLvw\n" +
            "zjGeQ+oV/9YHlS4pl6CqVytsjCcuPTZdwN84zdrir+sr+1uF7+dTQAiQaS3MWasZ\n" +
            "0dKkdPvtWUjY4qln2iwscG+GVR7L3zTg6g9T/3Sf5ss/g6bzODsDEdZQGwIa7Y+C\n" +
            "Il33W4zze66SWwQDtCOVxfZ5N734knSS0VW96AHBBcIB8gTnL+SPk0VS6WeUms+T\n" +
            "Rgg4lDdjKnS44M3vW4J045tvb4YOdgZW8BIRgXuQaiGnWU+oKk/QjClLiDdMa3E+\n" +
            "eQIDAQAB\n" +
            "-----END PUBLIC KEY-----";
}
