package ru.method.linkpatch.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "ru.method.linkenvisuals.LinkenVisuals", remap = false)
public class LinkenVisualsStartupLinkMixin {

    @Inject(method = "openStartupLink", at = @At("HEAD"), cancellable = true)
    private void lv$blockLink(String url, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "openStartupLinksAsync", at = @At("HEAD"), cancellable = true)
    private void lv$blockLinksAsync(CallbackInfo ci) {
        ci.cancel();
    }
          }
