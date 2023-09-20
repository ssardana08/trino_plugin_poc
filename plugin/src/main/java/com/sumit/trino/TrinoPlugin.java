package com.sumit.trino;

import com.google.common.collect.ImmutableSet;
import io.trino.spi.Plugin;
import java.util.Set;

public class TrinoPlugin implements Plugin
{
    @Override
    public Set<Class<?>> getFunctions(){
        return ImmutableSet.<Class<?>>builder()
                .build();
    }
}
