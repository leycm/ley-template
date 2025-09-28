/**
 * LECP-LICENSE NOTICE
 * <br><br>
 * This Sourcecode is under the LECP-LICENSE. <br>
 * License at: <a href="https://github.com/leycm/leycm/blob/main/LICENSE">GITHUB</a>
 * <br><br>
 * Copyright (c) LeyCM <leycm@proton.me> <br>
 * Copyright (c) maintainers <br>
 * Copyright (c) contributors
 */
package de.leycm.template;


import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * <p>
 * Provides static access to the {@link TemplateApi} instance.
 * Similar to LuckPermsProvider, this allows users to retrieve the API implementation
 * without directly depending on the core implementation.
 * </p>
 */
public final class TemplateApiProvider {
    private static TemplateApi instance = null;

    private TemplateApiProvider() {
        throw new UnsupportedOperationException("This class cannot be instantiated.");
    }

    /**
     * Returns the current {@link TemplateApi} API instance.
     *
     * @return the registered API instance
     * @throws IllegalStateException if no API implementation is registered
     */
    public static @NotNull TemplateApi get() {
        TemplateApi inst = instance;
        if (inst == null) {
            throw new NotLoadedException();
        }
        return inst;
    }

    /**
     * Registers the API implementation.
     * This method should be called by the core module at startup.
     *
     * @param api the API implementation
     */
    @ApiStatus.Internal
    public static void register(TemplateApi api) {
        if (instance != null) {
            throw new IllegalStateException("Template API already registered");
        }
        instance = api;
    }

    /**
     * Unregisters the API implementation.
     * This should be called during shutdown or when the implementation is no longer valid.
     */
    @ApiStatus.Internal
    public static void unregister() {
        instance = null;
    }

    /**
     * Exception thrown when the API is requested before it has been loaded.
     */
    private static final class NotLoadedException extends IllegalStateException {
        private static final String MESSAGE = """
                The Template API isn't loaded yet!
                Possible reasons:
                  a) Template core module not started or failed to load
                  b) Accessing TemplateApiProvider.get() too early
                  c) You shaded the API incorrectly into your jar
                """;

        NotLoadedException() {
            super(MESSAGE);
        }

    }
}
