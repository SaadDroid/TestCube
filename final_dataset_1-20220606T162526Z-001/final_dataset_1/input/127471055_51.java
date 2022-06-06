@GetMapping("/movie/details/{id}")
    public String getMovie(
        @PathVariable("id") final UUID id,
        @RequestParam(value = "returnUrl", defaultValue = "") final String returnUrl,
        final RedirectAttributes redirectAttributes,
        final Model model) {

        try {
            final MovieDto result = movieService.getMovie(id);

            model.addAttribute("movie", result);
            model.addAttribute("returnUrl", appUtils.getReturnUrl(returnUrl, "/"));

            return "movie/details";
        }
        catch (final MovieNotFoundException ex) {
            appUtils.addNotification(redirectAttributes,
                new Notification(NotificationType.ERROR, appUtils.getMessage("message.error.movieNotFound")));

            return "redirect:/";
        }
        catch (final Exception ex) {
            appUtils.addNotification(redirectAttributes,
                new Notification(NotificationType.ERROR, appUtils.getUnexpectedErrorMessage()));

            return "redirect:/";
        }
    }
